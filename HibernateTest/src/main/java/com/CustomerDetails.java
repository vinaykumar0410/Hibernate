package com;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class CustomerDetails {
	@Id
	private int custId;
	private String custEmail;
	private String custCity;
	
	
	@OneToOne(mappedBy = "customerDetails",cascade = CascadeType.ALL)
	private Customer customer;
	
	public CustomerDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomerDetails(int custId, String custEmail, String custCity) {
		super();
		this.custId = custId;
		this.custEmail = custEmail;
		this.custCity = custCity;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustCity() {
		return custCity;
	}

	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CustomerDetails [custId=" + custId + ", custEmail=" + custEmail + ", custCity=" + custCity + "]";
	}
	
	
	
}
