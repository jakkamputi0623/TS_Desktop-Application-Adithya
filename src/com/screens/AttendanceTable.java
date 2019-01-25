package com.screens;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import java.awt.Component;

public class AttendanceTable {
//public static void main(String[] args) {
	
	protected static final Integer Adate = null;
	String Attendence=null;
	JOptionPane jp=new JOptionPane();
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b; 
	JRadioButton r1;
	JRadioButton r2;

public AttendanceTable   ()
		{
		JFrame f=new JFrame("Attendance");
		l1=new JLabel("student ID:");
		l2=new JLabel("date:");
		Component l3 = new JLabel(" attendence");
		l3.setBounds(70,155,120,30);
		t1=new JTextField("");
		/*
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Date d1  = new Date();
	
		t2=new JTextField(df.format(d1));
		*/
		UtilDateModel model = new UtilDateModel();
		model.setDate(2019,01,9);
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, null);
		
		l1.setBounds(70,60, 120,30);
		l2.setBounds(70,100, 120,30);
		t1.setBounds(150,60, 100,30);
		//t2.setBounds(150,100, 100,30);
	datePicker.setBounds(150,100, 100,30);
		JRadioButton r1=new JRadioButton("present");    
		JRadioButton r2=new JRadioButton("absent");    
		r1.setBounds(160,150,100,40);    
		r2.setBounds(260,150,150,40);    
		ButtonGroup bg=new ButtonGroup();    
		bg.add(r1);
		bg.add(r2);    
		f.add(r1);
		f.add(r2);     
		
       
		 b=new JButton("Add");
		b.setBounds(100,400,100, 40);
		
		f.add(l1);
		f.add(l2);
		f.add(t1);
		//f.add(t2);
	f.add(datePicker);
		f.add(b);
		//f.add(l2);
		f.add(l3);
		
		f.setSize(500,500);
		f.setLayout(null); 
		f.setVisible(true); 
		

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String studentid=t1.getText();
				//String Adate=t2.getText();
				boolean isPresent = r1.isSelected();
				String attendance;
				if (isPresent) 
				  attendance = "P" ;				
				else 
				 attendance = "A" ;			
				//Date selectedDate = (Date) datePicker.getModel().getValue();
				Date s1 =   (Date) datePicker.getModel().getValue();
			//	java.sql.Date selectedDate = java.sql.Date.valueOf(s1.toString());
				System.out.println("after date");
				System.out.println(s1);
				String selectedDate="";
				System.out.println(s1.getDate());
				System.out.println(s1.getMonth());
				System.out.println(s1.getYear()+1900);
				int year = s1.getYear()+1900;
				switch (s1.getMonth())
					{
				case 0:
			
				 selectedDate= s1.getDate() + "-jan-"  + year;
				break;
				case 1:
					
					selectedDate = s1.getDate() + "-feb-"  + year;
					break;
                  case 2:
					
					selectedDate = s1.getDate() + "-mar-"  + year;
					break;
                  case 3:
  					
  					selectedDate = s1.getDate() + "-apr-"  + year;
  					break;
                  case 4:
  					
  					selectedDate = s1.getDate() + "-may-"  + year;
  					break;
                  case 5:
  					
  					selectedDate = s1.getDate() + "-jun-"  + year;
  					break;
                  case 6:
  					
  					selectedDate = s1.getDate() + "-jul-"  + year;
  					break;
                  case 7:
  					
  					selectedDate = s1.getDate() + "-aug-"  + year;
  					break;
                  case 8:
  					
  					selectedDate = s1.getDate() + "-sep-"  + year;
  					break;
                  case 9:
  					
  					selectedDate = s1.getDate() + "-oct-"  + year;
  					break;
                  case 10:
  					
  					selectedDate = s1.getDate() + "-nov-"  + year;
  					break;
                  case 11:
  					
  					selectedDate = s1.getDate() + "-dec-"  + year;
  					break;
						}
				System.out.println(selectedDate);
				try {	
				 	
				 	 Class.forName ("oracle.jdbc.driver.OracleDriver");
				     Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","studentdetails","123");
				 	 java.sql.Statement st= cn.createStatement();
				 	
				 	 PreparedStatement s = cn.prepareStatement("insert into Attendance (studentid,Adate,attendance) values (?,?,?)");
					s.setString(1,studentid);
					//s.setDate(2,selectedDate);
				//	s.setDate(2,s1);
				  s.setString(2, selectedDate);
					s.setString(3,attendance);
				
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
		
		
		
		
		}

			private void dispose(ActionEvent evt) {
				// TODO Auto-generated method stub
				
		
				    
				 			} //end of disp  method
 } // end of class
				 	
			 
				 
				 
				 
				 