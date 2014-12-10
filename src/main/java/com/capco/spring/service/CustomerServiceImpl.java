package com.capco.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capco.spring.dao.CustomerDao;
import com.capco.spring.entity.Customer;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	@Qualifier("jpaCustomerDao")
	private CustomerDao jpaCustomerDao;
	
	@Autowired
	@Qualifier("dummyCustomerDao")
	private CustomerDao dummyCustomerDao;
	
	private boolean useDB = true;
	
	@Override
	public List<Customer> findAllCustomers() {
		return getCustomerDao().findAll();
	}

	@Override
	public void addCustomer(Customer c) {
		getCustomerDao().addCustomer(c);
	}
	
	private CustomerDao getCustomerDao() {
		return useDB ? jpaCustomerDao : dummyCustomerDao;
	}

	public boolean isUseDB() {
		return useDB;
	}

	public void setUseDB(boolean useDB) {
		this.useDB = useDB;
	}
	
}
