package com.hibernate.query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;

public class DemoQueryGetList {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
			
			List<Instructor> instructors;
			
			//begin session
			
			session.beginTransaction();
			
			// get list of instructors
			
		instructors =	session.createQuery("from Instructor").getResultList();
		
		displayInstructors(instructors);
		
		
		// commit session
		session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
		
		
		
	}

	public static void displayInstructors(List<Instructor> instructors) {
		for(Instructor instructor: instructors) {
			
			if (instructor != null)
				System.out.println(instructor);
		}
	}

}
