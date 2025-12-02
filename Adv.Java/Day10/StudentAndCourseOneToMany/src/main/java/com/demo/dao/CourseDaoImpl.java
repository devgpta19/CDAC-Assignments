package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Course;

public class CourseDaoImpl implements CourseDao {
	private static SessionFactory sf;
	static {
		sf = HibernateUtils.getMySessionFactory();
	}

	@Override
	public boolean save(Course c) {
		if (c != null) {
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			session.save(c);
			tx.commit();
			session.close();
			return true;
		}
		return false;
	}

	@Override
	public Course showCourse(int cid) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Course c = session.load(Course.class, cid);
//		System.out.println(c);
		tx.commit();
		session.close();
//		System.out.println(c);
		return c;
	}

}
