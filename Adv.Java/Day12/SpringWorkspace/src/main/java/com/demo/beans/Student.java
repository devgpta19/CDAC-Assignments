package com.demo.beans;

public class Student {
	
	private int sid;
	private String sname;
	private Marks m1;
	private Subject sub1;
	
	public Student() {
		super();
	}
	
	public Student(int sid, String sname, Marks m1, Subject sub1) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.m1 = m1;
		this.sub1 = sub1;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Marks getM1() {
		return m1;
	}

	public void setM1(Marks m1) {
		this.m1 = m1;
	}

	public Subject getSub1() {
		return sub1;
	}

	public void setSub1(Subject sub1) {
		this.sub1 = sub1;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", m1=" + m1 + ", sub1=" + sub1 + "]";
	}
	
}
