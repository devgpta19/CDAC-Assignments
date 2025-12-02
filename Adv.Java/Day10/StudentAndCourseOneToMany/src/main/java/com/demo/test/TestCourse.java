package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Course;
import com.demo.service.CourseService;
import com.demo.service.CourseServiceImpl;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestCourse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CourseService cservice = new CourseServiceImpl();
		StudentService sservice = new StudentServiceImpl();
		int ch = 0;
		do {
			System.out.println("1. Add New Course\n" + "2. Display Course\n" + "3. Add Student\n"
					+ "4. Assign Student to the Course\n" + "5.Exit\n"
					+ "----------------------------------------------\n" + "Enter Your Choice: ");
			ch = sc.nextInt();
			switch (ch) {
			case 1 -> {
				boolean status = cservice.addNewCourse();
				if(status) {
					System.out.println("Course Added successfully...!");
				}else {
					System.out.println("Course Not Added...!");
				}
			}
			case 2->{
				System.out.println("Enter Course Id: ");
				int cid =sc.nextInt();
				Course c = cservice.displayCourse(cid);
				if(c!=null) {
					System.out.println(c);
				}else {
					System.out.println("Course Not Found For this "+cid+"Id");
				}
			}
			case 3->{
				boolean status = sservice.addNewStudent();
				if(status) {
					System.out.println("Course Added successfully...!");
				}else {
					System.out.println("Course Not Added...!");
				}
			}
			}
		} while (ch != 5);

	}

}
