package com.demo.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Cart;
import com.demo.beans.Items;

public class ItemDaoImpl implements ItemsDao {
	private static SessionFactory sf;
	static {
		sf = HibernateUtils.getMySessionFactory();
	}

	public Set<Items> getItemById(String str) {
		Set<Items> iset = new HashSet<Items>();
		String[] sarr = str.split(",");

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		for (String s : sarr) {
			Items i = session.get(Items.class, Integer.parseInt(s));
			iset.add(i);
		}
		tr.commit();
		session.close();
		return iset;
	}

	public Set<Items> addItems() {
		Set<Items> iset = new HashSet<Items>();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();

		tr.commit();
		session.close();
		return null;
	}

	public void save(Items i) {
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(i);
		tr.commit();
		session.close();

	}

	public Set<Items> getAllByCartId(int cid) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Cart cart = session.get(Cart.class, cid);
		Set<Items> iset = cart.getIset();
		tr.commit();
		session.close();

		return iset;
	}

	@Override
	public void save(Set<Items> iset, int cid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		for (Items i : iset) {
			session.save(i);
		}
		tr.commit();
		session.close();
	}

}
