package com.hb.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hb.entity.Course;
import com.hb.entity.Instructor;
import com.hb.entity.InstructorDetail;
import com.hb.entity.Reviews;

public class CreateDemoReviewCourse {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Reviews.class)
				.buildSessionFactory();
		
	Session session = factory.getCurrentSession();
	
	
	try {
		session.beginTransaction();
		
		Course MTH101 = new Course("Math Basics");
		
		Reviews review1 = new Reviews("Great Course !");
		Reviews review2 = new Reviews("Awful !");
		
		MTH101.addReview(review1);
		MTH101.addReview(review2);
		
		session.save(MTH101);
		
		System.out.println("Session Saved");
		System.out.println(MTH101);
		System.out.println(MTH101.getReviews());
		
		
		
		Course PSY101 = new Course("Physics Basics");
		
	
		PSY101.addReview(review1);
		PSY101.addReview(review2);
		
		session.save(PSY101);
		
		System.out.println("Session Saved");
		System.out.println(PSY101);
		System.out.println(PSY101.getReviews());
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		session.close();
		factory.close();
	}
		

		
	}

}
