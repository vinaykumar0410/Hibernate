package com;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", customerId=" + customerId + "]";
	}
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private CustomerDetails customerId;
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
	public CustomerDetails getCustomerDetails() {
		return customerId;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerId = customerDetails;
	}
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Customer() {
		
	}
}
