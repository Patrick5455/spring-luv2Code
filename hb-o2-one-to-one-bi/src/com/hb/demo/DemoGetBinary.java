package com.hb.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hb.entity.Instructor;
import com.hb.entity.InstructorDetail;

public class DemoGetBinary {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			// we want to test the bi-directional movement; whether a change in B will also affect A
			
		
			int myId =2;
			
			session.beginTransaction();
			
			InstructorDetail myInstructorDetail = session.get(InstructorDetail.class, myId);
			
			System.out.println("Instructor: "+myInstructorDetail);//.getInstructor());
			
			System.out.println( "Instructor: " +myInstructorDetail.getInstructor());

			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			session.close();
			factory.close();
		}
	}

}
