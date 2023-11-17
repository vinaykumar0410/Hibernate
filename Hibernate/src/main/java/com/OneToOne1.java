package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne1 {
	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(CustomerDetails.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Customer c1 = new Customer(1, "alex");
		Customer c2 = new Customer(2, "bob");
		CustomerDetails cd1 = new CustomerDetails(101, "alex@gmail.com", "9876543210", "tgm/vgm");
		CustomerDetails cd2 = new CustomerDetails(102, "bob@gmail.com", "9988776655", "vgm/tgm");
		c1.setCustomerDetails(cd1);
		c2.setCustomerDetails(cd2);
		Transaction transaction = session.beginTransaction();
//		session.save(c1);
//		session.save(c2);
//		Customer customer = session.get(Customer.class, 1);
//		CustomerDetails customerDetails = customer.getCustomerDetails();
//		System.out.println(customer);
//		System.out.println(customerDetails);
		CustomerDetails customerDetails = session.get(CustomerDetails.class,102);
		Customer customer = customerDetails.getCustomer();
		System.out.println(customerDetails);
		System.out.println(customer);
		transaction.commit();
	}
	
}
