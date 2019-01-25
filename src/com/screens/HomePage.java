package com.screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}
	
	
	
	public void close() {
		WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
	

	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Home Page");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdminLogin = new JButton("Admin");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin al = new AdminLogin();
				dispose();
				//al.setVisible(true);
				}
			});
		btnAdminLogin.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnAdminLogin.setBounds(155, 49, 118, 23);
		contentPane.add(btnAdminLogin);
		
		JButton btnFaculty = new JButton("Faculty");
		btnFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FacultyLogin fd = new FacultyLogin();
				dispose();
				//fd.setVisible(true);
				
				
				}
			});
		btnFaculty.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnFaculty.setBounds(155, 99, 118, 23);
		contentPane.add(btnFaculty);
	/*	
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Welcome_page wp = new Welcome_page();
			wp.setVisible(true);
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnCancel.setBounds(297, 189, 89, 23);
		contentPane.add(btnCancel);
	*/}
}
