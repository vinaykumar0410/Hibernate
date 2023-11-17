package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Test {
	public static void main(String[] args) {
//		Student s1 = new Student(25, "ram", "ram@gmail.com",86);
//		Student s2 = new Student(26, "lucky", "lucky@gmail.com",29);
//		Student s3 = new Student(27, "virat", "virat@gmail.com",82);
//		Student s4 = new Student(28, "abd", "abd@gmail.com",54);
		
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
//		session.save(s1);
//		session.save(s2);
//		session.save(s3);
//		session.save(s4);
		transaction.commit();
		String s = "from Student";
		Query createQuery = session.createQuery(s);
		List list = createQuery.list();
		for(Object std:list) {
			System.out.println(std);
		}
		System.out.println();
		Student student = session.get(Student.class,22);
		System.out.println(student);
		
	}
}
