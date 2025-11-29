package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Faculty;


public class TestProject {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Course c = new Course("Adv_Java", "Kishori", "3 weeks");
		Faculty f = new Faculty(01, "Kishori", "Adv_Java & Core_Java", c);
		Course c1 = new Course("C++", "Sampada", "3 weeks");
		Faculty f1 = new Faculty(02, "Sampada", "C++", c1);
		Course c2 = new Course("DBT", "Saleel", "3 weeks");
		Faculty f2 = new Faculty(03, "Saleel", "DBT", c2);
		Course c3 = new Course("SDM_OS", "Girish", "3 weeks");
		Faculty f3 = new Faculty(04, "Girish", "SDM", c3);
		Course c4 = new Course("WPT", "Rahul", "3 weeks");
		Faculty f4 = new Faculty(05, "Rahul", "WPT", c4);
		Course c5 = new Course("Aptitude", "Amit", "3 weeks");
		Faculty f5 = new Faculty(06, "Amit", "Aptitude", c5);
		session.save(c);
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);
		session.save(c5);
		session.save(f);
		session.save(f1);
		session.save(f2);
		session.save(f3);
		session.save(f4);
		session.save(f5);
		tx.commit();
		session.close();
		sf.close();

	}

}
