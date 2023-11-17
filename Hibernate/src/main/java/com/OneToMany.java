package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {
	public static void main(String[] args) {
		Configuration configuration = new Configuration()
				.configure().addAnnotatedClass(Customer1.class)
				.addAnnotatedClass(Orders.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer1 c1 = new Customer1(11,"Alex");
		Customer1 c2 = new Customer1(12,"Bob");
		Customer1 c3 = new Customer1(13,"Cesi");
		Customer1 c4 = new Customer1(14,"Dj");
		Orders o1 = new Orders(101, "mango",60);
		Orders o2 = new Orders(102, "grapes",80);
		Orders o3 = new Orders(103, "apples",160);
		Orders o4 = new Orders(104, "banana",40);
		o1.setCust_id(c1);
		o2.setCust_id(c2);
		o3.setCust_id(c3);
		o4.setCust_id(c4);
		session.save(o1);
		session.save(o2);
		session.save(o3);
		session.save(o4);
		transaction.commit();
	}
}
