package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Faculty;

public class TestProjectGetData {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Faculty f = session.get(Faculty.class, 4);
		Course c = session.get(Course.class, 34);

		System.out.println("---------- Faculty ----------");
		System.out.println(f);
		System.out.println("---------- Course ----------");
		System.out.println(c);
		System.out.println(c.getFaculty());

		tx.commit();
		session.close();
		sf.close();

	}

}
