package com.hibernate.query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;

public class DemoQueryUpdate {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
			// begin session
			session.beginTransaction();
			
			// get object
			
			int instructorId = 2;
			Instructor myInstructor = session.get(Instructor.class, instructorId);
			
			// update object name and email
			
			myInstructor.setFirstName("Onyeoka");
			myInstructor.setLastName("Chinedu");
			myInstructor.setEmail("chi@gmail.com");
			
			
			// ditto for instructor_detail
			
			InstructorDetail myInstructorDetail = session.get(InstructorDetail.class,  instructorId);
			
			myInstructorDetail.setHobby("Thinking");
			myInstructorDetail.setYoutubeChannel("www.youtube.com/chi");
			
			// associate the two objects
			myInstructor.setInstructorDetail(myInstructorDetail);
			
			
			System.out.println("Instructor Profile: "+myInstructor);
			System.out.println("Instructor Details: " + myInstructorDetail);
			
			// commit transaction
			
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
		
	}

}
