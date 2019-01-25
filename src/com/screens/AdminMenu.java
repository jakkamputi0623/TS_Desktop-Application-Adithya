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

public class AdminMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu frame = new AdminMenu();
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
	public AdminMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Admin Page");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnfaculty= new JMenu("Faculty");
		mnfaculty.setForeground(new Color(0, 0, 0));
		mnfaculty.setBackground(new Color(0, 102, 255));
		mnfaculty.setFont(new Font("Times New Roman", Font.BOLD, 12));
		menuBar.add(mnfaculty);
		
		JMenuItem mntmAdd = new JMenuItem("Add");
		mntmAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 FacultyDetails fd = new FacultyDetails();
			//fd.setVisible(true);
		 
			}
		});
		mnfaculty.add(mntmAdd);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		mntmDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//DeleteFaculty fd = new DeleteFaculty();	
		      //fd.setVisible(true);
				DeleteFaculty.main(new String[]{});
			}
		});
		mnfaculty.add(mntmDelete);
		
		JMenu mnstudent = new JMenu("Student");
		mnstudent.setForeground(new Color(0, 0, 0));
		mnstudent.setFont(new Font("Times New Roman", Font.BOLD, 12));
		menuBar.add(mnstudent);
		
		JMenuItem mntmAdd_1 = new JMenuItem("Add");
		mntmAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			StudentDetails sd = new StudentDetails();
			//sd.setVisible(true);
			
			}
		});
		mnstudent.add(mntmAdd_1);
		
		JMenuItem mntmDelete_1 = new JMenuItem("Delete");
		mntmDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			DeleteStudent ds= new DeleteStudent();
			ds.setVisible(true);
			
			
			}
		});
		mnstudent.add(mntmDelete_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenu mnAttendance= new JMenu("Attendance");
		mnAttendance.setForeground(new Color(0, 0, 0));
		mnAttendance.setBackground(new Color(0, 102, 255));
		mnAttendance.setFont(new Font("Times New Roman", Font.BOLD, 12));
		menuBar.add(mnAttendance);
		
		JMenuItem mntmadd = new JMenuItem("Report");
		mntmadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		AttendanceReport ar=new AttendanceReport();
		//ar.setVisible(true);
		 
			}
		});
		mnAttendance.add(mntmadd);
		
		
		
		
		
		
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
}
