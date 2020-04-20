package com.hb.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hb.entity.Instructor;
import com.hb.entity.InstructorDetail;

public class DemoDeleteBinary2 {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {

			session.beginTransaction();
			
			int selectId = 4;
			
			InstructorDetail myInstructorDetail = 
					session.get(InstructorDetail.class, selectId);
			
	//NB: What we want to achieve is to delete instructor detail without deleting instructor.  Hence we do not specify CasCade.REMOVE for Instructor reference in class InstructorDetail
			
			System.out.println("Deleting Instruction Detail");
			
			// dissociate Instructor from Instructor Detail by setting Instructor to null value
			
		//	Instructor myInstructor	= myInstructorDetail.setInstructor(null);
			
			myInstructorDetail.getInstructor().setInstructorDetail(null);
			
			session.delete(myInstructorDetail);
			
			System.out.println("Only Instructor deleted. Instructor remains (updated)");
			
			// we successfully broke the bi-directional link
		
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
