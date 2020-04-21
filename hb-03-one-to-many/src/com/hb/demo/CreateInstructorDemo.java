package com.hb.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hb.entity.Course;
import com.hb.entity.Instructor;
import com.hb.entity.InstructorDetail;

public class CreateInstructorDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
			// add new objects
			Instructor instructor = new Instructor("Ero", "Uj", "uj@gmail.com");
			Instructor instructor2 = new Instructor("Adeyinka", "Adedamola", "ade@gmail.com");
			
			InstructorDetail ero = new InstructorDetail("www.youtube.com/ero", "coding");
			
			InstructorDetail ade = new InstructorDetail("www.youtube.com/ade", "thinking");
			
			
			instructor.setInstructorDetail(ero);
			instructor2.setInstructorDetail(ade);
			
			
//			Course CSC101 = new Course("Computer Science", "10");
//			Course MTH101 = new Course("Maths", "11");
//			Course PHY101 = new Course("Physics", "10");
//			Course CHM101 = new Course("Chemistry", "11");
//
//			
//			instructor.addCourse(CSC101);
//			instructor2.addCourse(MTH101);
			
			// begin session
			session.beginTransaction();
			
			System.out.println(instructor);
			System.out.println(instructor2);
						
			//save transaction
			session.save(instructor);
			session.save(instructor2);
			
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
