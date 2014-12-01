package com.capco.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "firstName", length=32)
	private String firstName;
	
	@Column(name = "secondName", length=32)
	private String secondName;
	
	@Column(name = "address", length=256)
	private String address;
	
	public Customer(Long id, String firstName, String secondName, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.address = address;
	}
	
	public Customer() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", address=" + address + "]";
	}
	
}
