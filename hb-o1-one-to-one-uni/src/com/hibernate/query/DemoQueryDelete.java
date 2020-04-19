package com.hibernate.query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;

public class DemoQueryDelete {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		
		try {
			
			// create object and iniitialise id
			
			int instructorId = 1;
			
			// begin session
				session.beginTransaction();
	
			// get an instructor and assign to another instructor reference
			Instructor myInstructor = session.get(Instructor.class, instructorId);
			
		//delete object
			session.delete(myInstructor);
			
			//NB: instructor_detail of instructor with instructor id 1 would also be deleted because of the cascade operation
			
			// get session and commit transaction
			session.getTransaction().commit();	
		} finally {
			factory.close();
		}


		
	}

}
