package com.capco.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capco.spring.entity.Customer;
import com.capco.spring.service.CustomerService;

public class Main {

	private static ApplicationContext context;
	
	
	/**
	 * TODO:
	 * 1. init spring context
	 * 2  create dummy dao impl with list of customers defined in xml
	 * 3. create jpa dao impl
	 * 4. implement service with autowired dao
	 * 5. add one customer via service
	 * 4. display all customers
	 * 
	 */
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContext-base.xml");
		
		CustomerService customerService = context.getBean(CustomerService.class);
		customerService.addCustomer(new Customer("Kacer", "Donald", "Kacerovo"));
		for (Customer customer : customerService.findAllCustomers()) {
			System.out.println(customer);
		}
	}
}
