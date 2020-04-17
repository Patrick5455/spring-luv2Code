import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class TestJDBC {

	public static void main(String[] args) {
		
		String jdbcurl = "jdbc:mysql://127.0.0.1:3306/hb_student_tracker?useSSL=false"; 
		String user = "patrick";
		String pass = "O PEpatofat5455101$";

		try {
			
			System.out.println("SQL Connecting @: " + jdbcurl);
			
			Connection conn = DriverManager.getConnection(jdbcurl,user,pass);
			
			System.out.println("Connection Succesful");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
