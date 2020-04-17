package com.luv2code.jdbc;

import java.sql.*;
//import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		
		 String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&amp;serverTimezone=UTC";
		 String user = "patrick";
		 String pass = "OPEpatofat5455101$";
		 
		 
		 try {
		
		System.out.println("Connecting @: " + url);	 
		 Connection conn = DriverManager.getConnection(url, user, pass);
		 System.out.println("Connection Succesful");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
