package com.hb.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hb.entity.Course;
import com.hb.entity.Instructor;
import com.hb.entity.InstructorDetail;
import com.hb.entity.Reviews;

public class CreateReviewDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Reviews.class)
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
			session.beginTransaction();

			// create objetcs
			
			Instructor instructor = new Instructor("Patrick", "Ojunde", "pojunde@gmail.com");
			
			Instructor instructor2 = new Instructor("Stephen", "Ojunde", "m.ojunde@gmil.com");
			
			session.save(instructor);
			session.save(instructor2);
			
			Course MTH101 = new Course("Basic Maths");
			Course PSY101 = new Course("Basic Physics");
			
			instructor.addCourse(MTH101);
			instructor2.addCourse(PSY101);
			
			session.save(MTH101);
			session.save(PSY101);
		
			
			Reviews reviews = new Reviews("Gret COurse");
			Reviews reviews2 =new Reviews("Awseome !!!");
			Reviews reviews3 = new Reviews ("aWFUL !");
			Reviews reviews4 = new Reviews("Not bad !!");
			
			MTH101.addReview(reviews);
			PSY101.addReview(reviews2);
			MTH101.addReview(reviews3);
			PSY101.addReview(reviews4);
			
			session.save(reviews);
			session.save(reviews2);
			session.save(reviews3);
			session.save(reviews4);
			
	
			System.out.println("Instructor: "+instructor);
			System.out.println("Instructor2: "+instructor2);
			
			
			System.out.println("MTH 101: " +MTH101);
			System.out.println("PSY 101: " + PSY101);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();		}
		finally {
			factory.close();
			session.close();
		}
				
				
	}

}
