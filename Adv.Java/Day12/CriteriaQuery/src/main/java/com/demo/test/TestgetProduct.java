package com.demo.test;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.demo.beans.Product;

public class TestgetProduct {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
//		Criteria c = session.createCriteria(Product.class);
//		c.add(Restrictions.eq("price", 40));
//		List<Product> plist = c.list();
//		for (Product p : plist) {
//			System.out.println(p);
//		}
		
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		
		cq.select(root)
			.where(
					cb.gt(root.get("qty"), 10)
					);
		
		List<Product> plist = session.createQuery(cq).getResultList();
		for(Product p : plist) {
			System.out.println(p);
		}
		
		// plist.forEach(System.out::println);

		tx.commit();
		session.close();
		sf.close();
	}

}
