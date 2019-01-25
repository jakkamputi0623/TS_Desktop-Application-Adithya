package com.screens;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class FacultyLogin {    
	FacultyLogin()
	{
		dispItems();
	}
	
	public static void dispItems() {
		
	    Frame f= new Frame("Faculty login");  
		f.setSize(2000,2000);
		f.setVisible(true);                             
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) { 
					System.exit(0);}
			});
		
		 Label lable1,lable2;
		 lable1=new Label("UserName:");                   
		 lable1.setBounds(50,150, 100,30);  
		 lable2=new Label("PassWord:");  
		 lable2.setBounds(50,200, 100,30);  	
		 

		 f.add(lable1); 
		 f.add(lable2);  

		 f.setSize(400,400);  		
		 f.setLayout(null);  
		 f.setVisible(true);                                
		
		 TextField t1,t2 ;
		 t1=new TextField();                             
		 t1.setBounds(150,150, 180,20);  
		 JPasswordField t21=new JPasswordField();  
		 t21.setBounds(150,200, 180,20);  
		 f.add(t1); 
		 f.add(t21);  
		 f.setSize(400,400);  
		 f.setLayout(null);  
		 f.setVisible(true);                                 
		
		 Button btnEnter=new Button("Login"); 
		 
		 
		 btnEnter.setBounds(150,250,70,30);  
		 f.add(btnEnter);  
		 f.setSize(400,400);  
		 f.setLayout(null);   
		 f.setVisible(true);                                     
	
		 
		 
		 btnEnter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					String userName = null;                              
					String passWord = null;
					
	userName  = t1.getText();
	passWord = t21.getText();
		 if(t1.getText().length() == 0 || t21.getText().length()== 0)  
			{
		 JOptionPane.showMessageDialog(f,"Please enter username and password");
			}
		 else if (t1.getText().length()!= 5|| (t21.getText().length() !=3))     
	     
		
		 try {	
		
		 Class.forName ("oracle.jdbc.driver.OracleDriver");
	     Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","studentdetails","123");
		 java.sql.Statement st= cn.createStatement();
		 String sql="select * from FacultyLogin where username ='"+userName+"' and password='"+passWord+"'"; 
         ResultSet r= st.executeQuery(sql);	                   
		 if (r.next()==true) { 
			 System.out.println("sucess ....");
		 JOptionPane.showMessageDialog(f,"  You are successfully login ");  
	   FacultyMenu fm = new FacultyMenu();
	  fm.setVisible(true);
		 f.dispose();
		 }	
		 else
			 JOptionPane.showMessageDialog(f," enter valid username & password ");  
	       	 }
		 catch(Exception ee){                             
			System.out.println(ee.getMessage()); 
		 }
				}
			});
		 } //end of main 
	
	 	   
           
			    } //end of class

                          