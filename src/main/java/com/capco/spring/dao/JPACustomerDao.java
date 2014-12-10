package com.capco.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capco.spring.entity.Customer;

@Repository("jpaCustomerDao")
public class JPACustomerDao implements CustomerDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Customer> findAll() {
		return entityManager.createQuery("select c from Customer c").getResultList();
	}

	@Override
	public void addCustomer(Customer c) {
		entityManager.persist(c);
	}

}
