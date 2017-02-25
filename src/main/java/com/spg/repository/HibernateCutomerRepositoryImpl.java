package com.spg.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spg.model.Customer;

@Repository("customerRepository")
public class HibernateCutomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.spg.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		Customer customer  = new Customer();
		
		List<Customer> customers = new ArrayList();
		
		customer.setFirstName("John");
		customer.setLastName("Doe");
		
		customers.add(customer);
		
		return customers;
		
		
	}
	
}
