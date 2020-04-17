package com.luv2code.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class TestJDBC {

	public static void main(String[] args) {
		
		// the part after "false" in the url string is not compulsory
		String jdbcurl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&amp;serverTimezone=UTC"; //&amp;serverTimezone=UTC
		String user = "patrick";
		String pass = "OPEpatofat5455101$";

		try {
			
			System.out.println("SQL Connecting @: " + jdbcurl);
			
			Connection conn = DriverManager.getConnection(jdbcurl,user,pass);
			
			System.out.println("Connection Succesful");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
