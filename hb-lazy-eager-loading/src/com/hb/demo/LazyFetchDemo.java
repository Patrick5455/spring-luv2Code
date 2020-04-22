package com.hb.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hb.entity.Course;
import com.hb.entity.Instructor;
import com.hb.entity.InstructorDetail;

public class LazyFetchDemo {

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
			
			// lazy loading
				System.out.println("Instructor : " + instructor);
			
		// using option 1: 
					 System.out.println("Courses : " + instructor.getCourses());
			
		// using option 2:
			
			// REFER TO LazyFetchDemo.java file
				
			session.getTransaction().commit();
			
			session.close();
			
			System.out.println("\nluv2code: The session is now closed!\n");
			
			// using lazy loading after closed session -- #should not be -- would throw up error
			// to avoid this, we use either of the two options :
			//1. we have to have another load of courses before session cloases so we have it in memory and we call what we have in memory and not database. 
			//2. We use HQL - Hibernate Query Language
			
			System.out.println("Courses : " + instructor.getCourses());
			
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
