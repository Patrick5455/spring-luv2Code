package com.hb.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hb.entity.Course;
import com.hb.entity.Instructor;
import com.hb.entity.InstructorDetail;

public class GetCourseDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
			session.beginTransaction();
			
			int id = 1;
			
			Instructor instructor = session.get(Instructor.class, id);
			
			System.out.println("Instructor : " + instructor);
			System.out.println("Courses : " + instructor.getCourses());
			
			session.getTransaction().commit();
			System.out.println("Done !!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			session.close();
			factory.close();
		}
	}

}
