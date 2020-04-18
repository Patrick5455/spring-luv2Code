package com.luv2code.hibernate.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class MultipleIds {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				// it is not compulsory to include the config file in the parameter. by default, hibernate will look for the default file name called	 hibernate.cfg.xml.. hence you should name your hiberante config file this as hibernate.cfg.xml
				
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		 
		try {
			
			//create an object of table student
			Student student = new Student("Stephen", "Ojunde", "stephen@gmail.com");
			Student student1 = new Student("Florence", "Ojunde", "florence@gmail.com");
			Student student2 = new Student("Theophilus", "Ojunde", "theophilus@gmail.com");
			Student student3 = new Student("Patrick", "Ojunde", "patrick@gmail.com");

			//begin transaction
			session.beginTransaction();
			
			//save object to transaction
			session.save(student);
			session.save(student1);
			session.save(student2);
			session.save(student3);
			
			// get and commit transaction
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}

	}

}
