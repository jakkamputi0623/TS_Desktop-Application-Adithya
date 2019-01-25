package com.screens;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class StudentDetails {
	
	String studentid,studentname;
	static String subject;
	String age;
	String address;
	static TextField t1,t2,t3,t4,t5 ;
	 
   StudentDetails()
   {
	dispContents();
    }
   
	public static void dispContents() {
	
		 Frame f= new Frame("Welcome To Attendance Management System");  
			f.setSize(2000,2000);                             
			f.setVisible(true);                             
			
			f.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent windowEvent) { 
						System.exit(0);}
				});
			
	
			
			 Label lable1,lable2,lable3,lable4,lable5;
			 lable1=new Label("studentid:");                   
			 lable1.setBounds(50,50, 100,30);  
			 lable2=new Label("student name:");  
			 lable2.setBounds(50,80, 100,30);  	
			 lable3=new Label("subject:");  
			 lable3.setBounds(50,110, 100,30);  	
			 lable4=new Label("age:");  
			 lable4.setBounds(50,140, 100,30);  	
			 lable5=new Label("adress:");  
			 lable5.setBounds(50,170, 100,30);  	
			 f.add(lable1); 
			 f.add(lable2);  
			 f.add(lable3);  
			 f.add(lable4);  
			 f.add(lable5);  

			 f.setSize(400,400);  		
			 f.setLayout(null);  
			 f.setVisible(true);                                
			
			 t1=new TextField();                             
			 t1.setBounds(150,50, 120,20);  
			 t2=new TextField();                             
			 t2.setBounds(150,80, 120,20);  
			 t3=new TextField();                             
			 t3.setBounds(150,110, 120,20);  
			 t4=new TextField();                             
			 t4.setBounds(150,140, 120,20);  
			 t5=new TextField();                             
			 t5.setBounds(150,170, 120,20);  
			
			 f.add(t1); 
			 f.add(t2);  
			 f.add(t3);
			 f.add(t4);
			 f.add(t5);
			 f.setSize(400,400);  
			 f.setLayout(null);  
			 f.setVisible(true);                                 
			
			 Button btnEnter=new Button("ADD");                         
			 btnEnter.setBounds(150,250,70,30);  
			 f.add(btnEnter);  
			 f.setSize(400,400);  
			 f.setLayout(null);   
			 f.setVisible(true);                                     
		
			 btnEnter.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
				//	hp.setVisible(true);
					
					}
				});

btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String studentid=t1.getText();
				String studentname=t2.getText();
				String subject=t3.getText();
				String age=t4.getText();
				String address=t5.getText();
				
				 if(t1.getText().length() == 0)
					{
				 JOptionPane.showMessageDialog(f,"Please enter the studentid");
					}
				 else if(t2.getText().length() == 0)
					 JOptionPane.showMessageDialog(f,"Please enter the studentname");
			
				 else if(t3.getText().length() == 0)
					 JOptionPane.showMessageDialog(f,"Please enter the subject");
				 
				 else if(t4.getText().length() == 0)
					 JOptionPane.showMessageDialog(f,"Please enter the age");
				 
				 else if(t5.getText().length() == 0)
					 JOptionPane.showMessageDialog(f,"Please enter the address");
			
			
try {	
	
	 Class.forName ("oracle.jdbc.driver.OracleDriver");
    Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","studentdetails","123");
	 java.sql.Statement st= cn.createStatement();
	
	 PreparedStatement s = cn.prepareStatement("insert into Student (studentid,studentname,subject,age,address) values (?,?,?,?,?)");
	 s.setString(1,studentid);
	 s.setString(2,studentname);
	 s.setString(3,subject);
	 	 s.setString(4,age);
	 s.setString(5,address);
	 int i = s.executeUpdate();
	 	                   
	 if (i!=0) { 
		 System.out.println("added...");
	 JOptionPane.showMessageDialog(f," You are successfully added ");  
        AdminMenu am=new AdminMenu();  
	 f.dispose();
	 cn.close();

	 } // end of if
	 else
	 
		 System.out.println("not added");
      	 } //end of try 
	 catch(Exception ee){                             
		System.out.println(ee.getMessage()); 
	 }
			}

			});
   
			} //end of disp  method
} // end of class
	