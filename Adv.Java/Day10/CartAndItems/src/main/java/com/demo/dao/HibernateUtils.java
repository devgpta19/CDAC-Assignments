package com.demo.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	static SessionFactory sf;

	public static SessionFactory getMySessionFactory() {
		if (sf == null) {
			sf = new Configuration().configure().buildSessionFactory();
		}

		return sf;
	}
	
	public static void closeSessionFactory() {
		sf.close();
	}

}
