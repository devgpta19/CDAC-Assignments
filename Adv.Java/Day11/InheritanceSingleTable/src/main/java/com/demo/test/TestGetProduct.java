package com.demo.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.NonPerishableProducts;
import com.demo.beans.PerishableProducts;
import com.demo.beans.Product;

public class TestGetProduct {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		LocalDate ldt = LocalDate.parse("11/01/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Product p1 = session.get(PerishableProducts.class, 102);
		Product p2 = session.get(NonPerishableProducts.class, 101);
		Product p = session.get(Product.class, 101);
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);
		tr.commit();
		session.close();
		sf.close();

	}

}
