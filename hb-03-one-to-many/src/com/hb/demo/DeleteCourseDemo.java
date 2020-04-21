package com.hb.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hb.entity.Course;
import com.hb.entity.Instructor;
import com.hb.entity.InstructorDetail;

public class DeleteCourseDemo {

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
			
			int id = 11;
			
			Course delCourse = session.get(Course.class, id);
			
			session.delete(delCourse);
			
			System.out.println(delCourse);

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
