package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Course;
import com.demo.beans.Student;
import com.demo.dao.CourseDao;
import com.demo.dao.CourseDaoImpl;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {
	private StudentDao sdao;
	private CourseDao cdao = new CourseDaoImpl();

	public StudentServiceImpl() {
		sdao = new StudentDaoImpl();
	}

	@Override
	public boolean addNewStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id");
		int sid = sc.nextInt();
		System.out.println("Enter Student Name");
		String sname = sc.next();
		System.out.println("Enter course id");
		int cid = sc.nextInt();
		Course c = cdao.showCourse(cid);

		Student s = new Student(sid, sname, c);
		return sdao.save(s);
	}
}
