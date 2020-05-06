package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerRepository {
	
	List<Customer> getCustomers();

	void save(Customer customer);
	
	Customer update(Integer id);

	void delete(int id);

	void delete2(int id);

}
