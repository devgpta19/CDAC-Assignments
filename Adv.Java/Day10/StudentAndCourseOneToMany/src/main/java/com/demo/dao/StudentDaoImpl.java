package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {

	private static SessionFactory sf;
	static {
		sf = HibernateUtils.getMySessionFactory();
	}

	@Override
	public boolean save(Student s) {
		if (s != null) {
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			session.save(s);
			tx.commit();
			session.close();
			return true;
		}
		return false;
	}

	@Override
	public Student getStdById(int sid) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Student std = session.get(Student.class, sid);
		tx.commit();
		session.close();
		return std;
	}

}
