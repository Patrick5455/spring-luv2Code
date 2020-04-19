package com.luv2code.hibernate.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			// create a reference to student object
			int studentId =1;
			Student myStudent = session.get(Student.class, studentId);
			
			//delete method 1
			session.delete(myStudent);
			
			//delete method 2
			session.createQuery("delete from Student where id = 2").executeUpdate();
			
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
	}

}
