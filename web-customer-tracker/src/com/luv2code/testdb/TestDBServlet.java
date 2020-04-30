package com.luv2code.testdb;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// setup connection variables
		String user = "patrick";
		String password = "OPEpatofat5455101#";
		String url = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		
		// get connection to the database
		
		try {
			
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to database" + url);
			
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,user,password);
			
			out.println("SUCCESS !!!");
			
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException();
			
		}
		
		
		
	}

}
