package com;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	private int id;
	private String name;
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerDetails")
	private CustomerDetails customerDetails;
	
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	private List<Orders> orders;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(CustomerDetails customerDetails) {
		super();
		this.customerDetails = customerDetails;
	}



	public Customer(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", customerDetails=" + customerDetails + "]";
	}
	
	
	
	
}
