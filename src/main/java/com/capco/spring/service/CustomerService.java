package com.capco.spring.service;

import java.util.List;

import com.capco.spring.entity.Customer;

public interface CustomerService {

	public List<Customer> findAllCustomers();
	
	public void addCustomer(Customer c);
}
