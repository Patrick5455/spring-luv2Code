package com.luv2code.hibernate.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				// it is not compulsory to include the config file in the parameter. by default, hibernate will look for the default file name called	 hibernate.cfg.xml.. hence you should name your hiberante config file this as hibernate.cfg.xml
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			//create an object of table student
			Student student = new Student("Stephen", "Mayowa", "stephenmayowa@gmail.com");
			
			//begin transaction
			session.beginTransaction();
			
			//save object to transaction
			session.save(student);
			
			// get and commit transaction
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}

	}

}
