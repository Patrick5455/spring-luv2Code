package com.hibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&amp;serverTimezone=UTC";
		
		String user = "patrick";
		String pass = "OPEpatofat5455101#";
		
		
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			
			System.out.println("Connection Successful");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
		
	}

}
