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
		
	
		Query<Customer> query = session.createQuery("from Customer order by  lastName",Customer.class);
		
		
		List<Customer> customers = query.getResultList();
		
		return customers;
	}


	@Override
	public void save(Customer customer) {
		
		Session session = factory.getCurrentSession();
		
		session.saveOrUpdate(customer);
		
	}


	@Override
	public Customer update(Integer id) {
		Session session = factory.getCurrentSession();
		
		Customer customer = session.get(Customer.class, id);
		
		return customer;
	
	}


	@Override
	public void delete(int id) {
		
		Session session = factory.getCurrentSession();
		
		Customer customer = session.get(Customer.class, id);
		
		session.delete(customer);
		
	}


	
	@Override
	// 2nd delete method using HQl
	public void delete2(int theid) {
		
		Session session = factory.getCurrentSession();
		
		 Query query = session.createQuery("delete from Customer where id=:customerId");
		 
		 query.setParameter("customerId", theid);
		 
		 query.executeUpdate();
		
	}
	
	


}
