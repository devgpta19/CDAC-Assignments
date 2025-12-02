package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Course;
import com.demo.beans.Student;
import com.demo.dao.CourseDao;
import com.demo.dao.CourseDaoImpl;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class CourseServiceImpl implements CourseService {
	private CourseDao cdao;
	private StudentDao sdao = new StudentDaoImpl();

	public CourseServiceImpl() {
		cdao = new CourseDaoImpl();
	}

	@Override
	public boolean addNewCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course Id:");
		int cid = sc.nextInt();

		System.out.println("Enter Course Name:");
		String cname = sc.next();

		System.out.println("Enter Course End Date:");
		String edt = sc.next();
		LocalDate ldt = LocalDate.parse(edt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		System.out.println("Enter Faculty name:");
		String fname = sc.next();
		
//		System.out.println("Enter Student Id:");
//		int sid = sc.nextInt();
//		Student s = sdao.getStdById(sid);
//		List<Student> slist = new ArrayList<>();
//		if(s!=null) {
//			slist.add(s);
//		}

		Course c = new Course(cid, cname, ldt, fname);
		return cdao.save(c);
	}

	@Override
	public Course displayCourse(int cid) {
		return cdao.showCourse(cid);
	}
}
