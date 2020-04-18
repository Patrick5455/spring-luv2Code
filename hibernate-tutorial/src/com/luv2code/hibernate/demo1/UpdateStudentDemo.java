package com.luv2code.hibernate.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {
	
	//NB: There is nothing like session.update unlike session.delete for deletion and session.get for retrieval
	
	public static void main(String...args) {
		
	SessionFactory factory = new Configuration()
			.configure()
			.addAnnotatedClass(Student.class)
			.buildSessionFactory();
	Session session = factory.getCurrentSession();
	try {
									//update single object		
		Integer studentId = 1;

		//begin session
		session.beginTransaction();
		
		// assign the choice Student object to  Student reference
	Student myStudent=session.get(Student.class, studentId);
	// update the choice Student object last name with the Student reference
	myStudent.setLastName("Ojokoro");
	
									// update multiple object
	
	session.createQuery("update Student set email = 'val@gmail.com'").executeUpdate();
		
		//commit the changes to the database
	System.out.println(myStudent);
	
	session.getTransaction().commit();
	}
	finally {
		factory.close();}
	}
}
