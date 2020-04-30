package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerRepoitoryImpl implements CustomerRepository {

	@Autowired
	private SessionFactory factory;
	
	
	@Override
//	@Transactional no longer required because it is handled by the service class. 
	//@ Transactional would be in the service class
	public List<Customer> getCustomers() {
		
		Session session = factory.getCurrentSession();
		
	
		Query<Customer> query = session.createQuery("from Customer",Customer.class);
		
		
		List<Customer> customers = query.getResultList();
		
		return customers;
	}

}
