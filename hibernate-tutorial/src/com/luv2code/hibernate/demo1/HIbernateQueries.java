package com.luv2code.hibernate.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.mapping.List;
import java.util.List;

import com.luv2code.hibernate.demo.entity.Student;
public class HIbernateQueries {

	public static void main(String[] args) {
		
		//create sessionFactory
		
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
			session.beginTransaction();
			
			// get a list of students from the database
			
			List<Student> students1 = session.createQuery("from Student").getResultList();
			
			displayStudent(students1);
			
			System.out.println("\n\n\n");
			
			// get list of students whose last name = "Ojunde"
			
			List<Student> students2 = session.createQuery("from "
					+ "Student s where s.lastName='Ojunde'").getResultList();
			
			displayStudent(students2);
			
			System.out.println("\n\n\n");
			
			// get list of students whose email contains @gmail.com"

			
			List<Student> students3 = session.createQuery("from "
					+ "Student s where s.email like '%@gmail.com'").getResultList();
			
			displayStudent(students3);
						
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}

	}

	public static void displayStudent(List<Student> students) {
		for(Student student : students) {
			
			System.out.println(student);
			
		}
	}

}
