package com.screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class FacultyMenu extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacultyMenu frame = new FacultyMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FacultyMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("FacultyMenu");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnstudent = new JMenu("student");
		mnstudent.setForeground(new Color(0, 0, 0));
		mnstudent.setFont(new Font("Times New Roman", Font.BOLD, 12));
		menuBar.add(mnstudent);
		
		JMenuItem mntmAdd_1 = new JMenuItem("Show");
		mntmAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("in student");
			StudentsTable sd = new StudentsTable();
			
			//sd.setVisible(true);
			}
		});
		
		mnstudent.add(mntmAdd_1);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JMenu mnAttendance= new JMenu("Attendance");
		mnAttendance.setForeground(new Color(0, 0, 0));
		mnAttendance.setBackground(new Color(0, 102, 255));
		mnAttendance.setFont(new Font("Times New Roman", Font.BOLD, 12));
		menuBar.add(mnAttendance);
		
		
		JMenuItem mntmAdd_2 = new JMenuItem("Mark");
		mntmAdd_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("in Attendance");
			AttendanceTable at=new AttendanceTable();
			//at.setVisible(true);
			}
		});
		mnAttendance.add(mntmAdd_2);

		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AdminLogin al= new AdminLogin();
			//al.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnBack.setBounds(301, 179, 89, 23);
		contentPane.add(btnBack);
	}
	
	//AdminLogin al=new AdminLogin();
};
