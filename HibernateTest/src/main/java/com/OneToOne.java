package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(CustomerDetails.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
//		Customer c1 = new Customer(1,"sai",21);
//		Customer c2 = new Customer(2,"vinay",22);
//		Customer c3 = new Customer(3,"ram",21);
//		Customer c4 = new Customer(4,"virat",26);
//		Customer c5 = new Customer(5,"alice",25);
//		Customer c6 = new Customer(6,"bob",24);
//		session.save(c6);
		
//		CustomerDetails cd1 = new CustomerDetails(101,"sai@gmail.com","kadapa");
//		CustomerDetails cd2 = new CustomerDetails(102,"vinay@gmail.com","vizag");
//		CustomerDetails cd3 = new CustomerDetails(103,"ram@gmail.com","kerala");
//		CustomerDetails cd4 = new CustomerDetails(104,"virat@gmail.com","mumbai");
//		CustomerDetails cd5 = new CustomerDetails(105,"alice@gmail.com","chennai");
		
//		CustomerDetails cd6 = new CustomerDetails(106,"bob@gmail.com","kolkata");
		Customer customer = session.get(Customer.class,6);
//		customer.setCustomerDetails(cd6);
		System.out.println(customer);
		
//		c1.setCustomerDetails(cd1);
//		c2.setCustomerDetails(cd2);
//		c3.setCustomerDetails(cd3);
//		c4.setCustomerDetails(cd4);
//		c5.setCustomerDetails(cd5);
		
//		session.save(c1);
//		session.save(c2);
//		session.save(c3);
//		session.save(c4);
//		session.save(c5);
		
		
		transaction.commit();
	}
}
