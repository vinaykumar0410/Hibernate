package com;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "OrdersTable")
public class Orders {
	@Id
	@Column
	private int Oid;
	@Column
	private String item;
	@Column
	private int price;
	@JoinColumn(name = "cust_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer1 cust_id;
	
	
	public Customer1 getCust_id() {
		return cust_id;
	}
	public void setCust_id(Customer1 cust_id) {
		this.cust_id = cust_id;
	}
	public int getOid() {
		return Oid;
	}
	public void setOid(int oid) {
		Oid = oid;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Orders(int oid, String item, int price) {
		super();
		Oid = oid;
		this.item = item;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Orders [Oid=" + Oid + ", item=" + item + ", price=" + price + "]";
	}
	
}
