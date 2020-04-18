package com.luv2code.hibernate.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.mapping.List;
import java.util.List;

import com.luv2code.hibernate.demo.entity.Student;
public class QueryStudentDemo {

	public static void main(String[] args) {
		
		//create sessionFactory
		
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
			List<Student> students;
			
			session.beginTransaction();
			
			// get a list of students from the database
			
			students = session.createQuery("from Student").getResultList();
			
			displayStudent(students);
			
			System.out.println("\n\n\n");
			
			// get list of students whose last name = "Ojunde"
			
			students = session.createQuery("from "
					+ "Student s where s.lastName='Ojunde'").getResultList();
			
			displayStudent(students);
			
			System.out.println("\n\n\n");
			
			// get list of students whose email contains @gmail.com"

			
			students = session.createQuery("from "
					+ "Student s where s.email like '%@gmail.com'").getResultList();
			
			displayStudent(students);
						
			session.getTransaction().commit();		
		} finally {
			factory.close();
		}
	}
	//method call
	public static void displayStudent(List<Student> students) {
		for(Student student : students) {		
			System.out.println(student);
		}
	}
}
