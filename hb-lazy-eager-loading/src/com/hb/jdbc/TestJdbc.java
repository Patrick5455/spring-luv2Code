package com.hb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/hb-03-one-to-many?useSSL=false";
		
		String user = "patrick";
		String pass="OPEpatofat5455101#";
		
		
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("connection successful");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
