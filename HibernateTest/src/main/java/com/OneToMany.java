package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

public class OneToMany {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure()
						.addAnnotatedClass(Customer.class)
						.addAnnotatedClass(CustomerDetails.class)
						.addAnnotatedClass(Orders.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
//		Orders o1 = new Orders(501,"macbook",120000);	
//		Orders o2 = new Orders(502,"iphone",150000);	
//		Orders o3 = new Orders(503,"samsung",30500);	
//		Orders o4 = new Orders(504,"redmi",20000);	
//		Orders o5 = new Orders(505,"headset",12000);	
		
//		Customer c1 = session.get(Customer.class,1);
//		Customer c2 = session.get(Customer.class,2);
//		Customer c3 = session.get(Customer.class,3);
//		Customer c4 = session.get(Customer.class,4);
//		Customer c5 = session.get(Customer.class,5);
		
//		o1.setCustomer(c1);
//		o2.setCustomer(c1);
//		o3.setCustomer(c2);
//		o4.setCustomer(c3);
//		o5.setCustomer(c5);
		
//		session.save(o1);
//		session.save(o2);
//		session.save(o3);
//		session.save(o4);
//		session.save(o5);
		
//		Customer c5 = session.get(Customer.class, 5);
//		session.delete(c5);
//		session.delete(session.get(Orders.class,504));
		
		transaction.commit();
	}
}








