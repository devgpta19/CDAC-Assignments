package com.demo.beans;

public class Faculty {

	private int fid;
	private String fname;

	public Faculty() {
		super();
	}

	public Faculty(int fid, String fname) {
		super();
		this.fid = fid;
		this.fname = fname;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + "]";
	}

}
