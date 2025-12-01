package com.demo.dao;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Cart;
import com.demo.beans.Items;

public class CartDaoImpl implements CartDao {

	static SessionFactory sf = null;
	static {
		sf = HibernateUtils.getMySessionFactory();
	}
	
	public void save(Cart cart) {
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		session.save(cart);
		
		tr.commit();
		session.close();
	}

	public void display(int cid) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Cart cart = session.get(Cart.class, cid);
		System.out.println(cart);
		tr.commit();
		session.close();
		
	}

	public void displayCartItems(int cid1) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Cart cart = session.get(Cart.class, cid1);
		
		System.out.println(cart.getIset());
		tr.commit();
		session.close();
		
	}

}
