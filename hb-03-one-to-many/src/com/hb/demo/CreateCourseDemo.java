package com.hb.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hb.entity.Course;
import com.hb.entity.Instructor;
import com.hb.entity.InstructorDetail;

public class CreateCourseDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
			session.beginTransaction();
			
			int id = 1;
			
			Instructor myInstructor = session.get(Instructor.class, id);
			
			Course MTH101 = new Course("Basic Maths");
			Course PSY101 = new Course("Basic Physics");
			
			myInstructor.addCourse(MTH101);
			myInstructor.addCourse(PSY101);
			
		session.save(MTH101);
		session.save(PSY101);
		
		System.out.println(MTH101);
		System.out.println(PSY101);
		
		session.getTransaction().commit();
			
		System.out.println("Done !");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}


	}

}
