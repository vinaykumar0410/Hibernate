package com;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_details")
public class CustomerDetails {
	@Id
	@Column(name = "customer_id")
	private int id;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String phone;
	@Column(name = "address")
	private String address;
	@OneToOne(mappedBy = "customerId",cascade = CascadeType.ALL)
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public CustomerDetails() {
		
	}
	public CustomerDetails(int id, String email, String phone, String address) {
		super();
		this.id = id;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	@Override
	public String toString() {
		return  id + ", " + email + ", " + phone + ", " + address;
	}
	
}
