package com.capco.spring.dao;

import java.util.List;

import com.capco.spring.entity.Customer;

public interface CustomerDao {

	public List<Customer> findAll();
	
	public void addCustomer(Customer c);
}
