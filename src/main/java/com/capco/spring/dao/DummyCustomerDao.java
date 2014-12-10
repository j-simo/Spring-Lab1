package com.capco.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.capco.spring.entity.Customer;

@Repository(value="dummyCustomerDao")
public class DummyCustomerDao implements CustomerDao{

	private List<Customer> dummyList;
	
	public DummyCustomerDao() {
		dummyList = new ArrayList<Customer>();
		dummyList.add(new Customer("Janko", "Mrkvicka", "Novaky"));
	}

	@Override
	public List<Customer> findAll() {
		return dummyList;
	}

	@Override
	public void addCustomer(Customer c) {
		this.dummyList.add(c);
	}
	
	public void setDummyList(List<Customer> dummyList) {
		this.dummyList = dummyList;
	}
}
