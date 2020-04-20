package com.hb.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hb.entity.Instructor;
import com.hb.entity.InstructorDetail;

public class DemoDeleteBinary {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {

			session.beginTransaction();
			
			int selectId = 3;
			
			InstructorDetail myInstructorDetail = 
					session.get(InstructorDetail.class, selectId);
			
	//NB: Instructor will also be deleted because of the CASCADE.ALL
			System.out.println("Deleting Instruction Detail");
			session.delete(myInstructorDetail);
			
			
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
