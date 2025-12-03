package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Student;

public class TestSpringWorkshop {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfigA.xml");

		Student s = (Student) ctx.getBean("stu1");
		System.out.println(s);

		((ClassPathXmlApplicationContext) ctx).close();
	}
}
