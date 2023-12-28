package com;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {
	@Id
	private int oId;
	private String oName;
	private int oPrice;
	
	@JoinColumn(name = "custId")
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Customer customer;	
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}
	
	public Orders(int oId, String oName, int oPrice) {
		super();
		this.oId = oId;
		this.oName = oName;
		this.oPrice = oPrice;
	}
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public int getoPrice() {
		return oPrice;
	}
	public void setoPrice(int oPrice) {
		this.oPrice = oPrice;
	}
//	@Override
//	public String toString() {
//		return "Order [oId=" + oId + ", oName=" + oName + ", oPrice=" + oPrice + "]";
//	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
