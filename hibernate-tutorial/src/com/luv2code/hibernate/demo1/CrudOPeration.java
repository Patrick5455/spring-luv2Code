package com.luv2code.hibernate.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.luv2code.hibernate.demo.entity.Student;

public class CrudOPeration {
	
	public static void main(String... args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// create a session
		Session session = factory.getCurrentSession();
		
		try {
			//create student object for session transaction
			Student student = new 	Student("Patrick","Ojunde","patrickojunde@gmail.com");
			System.out.println("creating new student");
			
			// begin transaction
			session.beginTransaction();
			System.out.println("beginning trnsaction");
			
			//save student transaction
			session.save(student);
			System.out.println("saving transaction");
			
			//get and commit student transaction
			session.getTransaction().commit();
			System.out.println("committing transaction");
			
			
		} finally {
			factory.close();
		}
		
		
	}

}
