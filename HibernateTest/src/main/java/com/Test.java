package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Test {
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
//		System.out.println("Configured...");
		Transaction transaction = session.beginTransaction();
		
//		Student s1 = new Student("vinay","kadapa");
//		Student s2 = new Student("virat","delhi");
//		Student s3 = new Student("ram","hyd");
//		Student s4 = new Student("sai","vizag");
		
//		session.save(s1);
//		session.save(s2);
//		session.save(s3);
//		session.save(s4);
		
//		Query query = session.createQuery("update Student set city = 'kerala' where id = 3");
//		int rowAffectedCount = query.executeUpdate();
//		System.out.println(rowAffectedCount);
		
//		Query query = session.createQuery("delete from Student where id=2");
//		int rowAffectedCount = query.executeUpdate();
//		System.out.println(rowAffectedCount);
		
//		Query query = session.createQuery("from Student");
//		List list = query.list();
////		System.out.println(list);
//		for(Object i : list) {
//			System.out.println(i);
//		}
		
		
		transaction.commit();
	}
}
