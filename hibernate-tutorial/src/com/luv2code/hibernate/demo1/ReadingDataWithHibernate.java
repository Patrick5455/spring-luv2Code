package com.luv2code.hibernate.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadingDataWithHibernate {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
			
			Student readStudent = new Student("LOve", "Vola", "love@gmail.com");

			session.beginTransaction();
			
			session.save(readStudent);
						
			// retrive a particluar student info using the ID.
			
			System.out.println("Student id is: " + readStudent.getId());
			
			Student studentInfo = session.get(Student.class, readStudent.getId());

			System.out.println(studentInfo);
			
			// NB: This method call closes the session.
			session.getTransaction().commit();

			
		} finally {
			
			factory.close();
			
		} 
		
	}

}
