package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Product;

public class TestAddProduct {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Product p1 = new Product("Lays", 20, 25);
		Product p2 = new Product("Burger", 10, 90);
		Product p3 = new Product("Popcorn", 12, 15);
		Product p4 = new Product("Cheeze", 25, 250);
		Product p5 = new Product("Pizza", 30, 205);
		session.save(p5);
		session.save(p4);
		session.save(p3);
		session.save(p2);
		session.save(p1);
		tx.commit();
		session.close();
		sf.close();
	}
}
