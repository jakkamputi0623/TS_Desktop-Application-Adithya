package com.screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Welcome_page extends JFrame {
	
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome_page frame = new Welcome_page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	public void close() {
		WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
	
	

	        /**
	        * Create the frame.
	        */
	        public Welcome_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Welcome Page");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToAttendance = new JLabel("Welcome To Attendance Management System");
		lblWelcomeToAttendance.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblWelcomeToAttendance.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToAttendance.setBounds(39, 31, 349, 64);
		contentPane.add(lblWelcomeToAttendance);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
		HomePage lp = new HomePage();
		lp.setVisible(true);
		dispose();
			}
		});
		btnEnter.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnEnter.setBounds(146, 154, 101, 23);
		contentPane.add(btnEnter);
		
	}
}
