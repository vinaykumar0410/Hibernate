package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class UpdateExample {
	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
//		Student student = session.get(Student.class,21);
//		student.setMarks(96);
//		session.update(student);
//		Student student = new Student(29,"ram","ram@gmail.com",67);
//		session.saveOrUpdate(student);
//		String query = "update Student s set s.marks = 50 where s.marks < 50";
//		Query q = session.createQuery(query);
//		int i = q.executeUpdate();
//		System.out.println(i);
//		Student student = session.get(Student.class, 29);
//		session.delete(student);
//		Student student2 = session.get(Student.class, 25);
//		session.delete(student2);
		String s = "delete from  Student s where s.marks = 50";
		Query q = session.createQuery(s);
		q.executeUpdate();
		transaction.commit();
	}
}
