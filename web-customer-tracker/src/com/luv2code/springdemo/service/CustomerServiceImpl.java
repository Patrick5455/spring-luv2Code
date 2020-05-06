package com.luv2code.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.dao.CustomerRepository;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		customerRepository.save(customer);
		
	}

	@Override
	@Transactional
	public Customer update(int theId) {
		
	return	customerRepository.update(theId);
		
	}

	@Override
	@Transactional
	public void delete(int id) {

		customerRepository.delete(id);
	}

	@Override
	@Transactional
	public void delete2(int id) {
		
		customerRepository.delete2(id);
	}

}
