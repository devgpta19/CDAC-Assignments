package com.demo.beans;

public class Subject {

	private String subName;
	private Faculty fac;

	public Subject() {
		super();
	}

	public Subject(String subName, Faculty fac) {
		super();
		this.subName = subName;
		this.fac = fac;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public Faculty getFac() {
		return fac;
	}

	public void setFac(Faculty fac) {
		this.fac = fac;
	}

	@Override
	public String toString() {
		return "Subject [subName=" + subName + "]";
	}	
}
