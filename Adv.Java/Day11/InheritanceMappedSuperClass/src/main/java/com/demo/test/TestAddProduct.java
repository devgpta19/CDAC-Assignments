package com.demo.test;

import java.time.LocalDate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.beans.NonPerishableProducts;
import com.demo.beans.PerishableProducts;
import com.demo.beans.Product;

public class TestAddProduct {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Product p = new PerishableProducts(103, "Chips", 25, 20, LocalDate.of(2025, 01, 25));
		Product p1 = new NonPerishableProducts(102, "Chair", 5, 2000, 5);

		session.save(p);
		session.save(p1);

		tr.commit();
		session.close();
		sf.close();
	}
}
