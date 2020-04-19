package com.hibernate.query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;

public class DemoQueryCreate {

	public static void main(String[] args) {
		

		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class)
				.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
			//create the objects
			
			Instructor instructor =  new Instructor("Patrick", "Ojunde", "pat@gmailcom");
			
			InstructorDetail instructorDetail = new InstructorDetail("www.youtube.com/pat", "coding");
			
	Instructor instructor2 =  new Instructor("Mayowa", "Ojunde", "may@gmailcom");
			
			InstructorDetail instructorDetail2 = new InstructorDetail("www.youtube.com/may", "reading");
			
		
		
		//begin transaction
			session.beginTransaction();
			
			
			//link the two objects
			
			instructor.setInstructorDetail(instructorDetail);
			instructor2.setInstructorDetail(instructorDetail2);
			

			//save transaction
			
			session.save(instructor);
			session.save(instructor2);
			
			System.out.println("Objects Saved");

			// commit session
			
			session.getTransaction().commit();
		
		} finally {
			factory.close();
		}
		
	}

}
