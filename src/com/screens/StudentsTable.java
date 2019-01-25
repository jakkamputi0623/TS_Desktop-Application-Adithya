package com.screens;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentsTable {
	StudentsTable()
	{
		System.out.println("in constructor");
		show();
		
	}

	public static DefaultTableModel StudentsTable(ResultSet rs)
	        throws SQLException {

	    ResultSetMetaData metaData = rs.getMetaData();

	    // names of columns
	    Vector<String> columnNames = new Vector<String>();
	    int columnCount = metaData.getColumnCount();
	    for (int column = 1; column <= columnCount; column++) {
	        columnNames.add(metaData.getColumnName(column));
	    }

	    // data of the table
	    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
	    while (rs.next()) {
	        Vector<Object> vector = new Vector<Object>();
	        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
	            vector.add(rs.getObject(columnIndex));
	        }
	        data.add(vector);
	    }

	    return new DefaultTableModel(data, columnNames);

	}
	
	public static void show()  {
	    // The Connection is obtained

		Connection cn;
		try {
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","studentdetails","123");
		
		 java.sql.Statement st= cn.createStatement();
		 String sql="select * from student"; 
        
	    ResultSet rs = st.executeQuery(sql);

	    // It creates and displays the table
	    JTable table = new JTable(StudentsTable(rs));
	    JOptionPane.showMessageDialog(null, new JScrollPane(table));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    // Closes the Connection

	  
	}
}
