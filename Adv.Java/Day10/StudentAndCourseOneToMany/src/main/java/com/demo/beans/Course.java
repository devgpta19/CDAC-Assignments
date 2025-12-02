package com.demo.beans;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="course11")
public class Course {
	@Id
	private int cid;
	private String cname;
	private LocalDate endDate;
	private String fcName;
	@OneToMany(mappedBy="course")
	private List<Student> slist;
	public Course() {
		super();
	}
	public Course(int cid, String cname, LocalDate endDate, String fcName) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.endDate = endDate;
		this.fcName = fcName;
	}
	public Course(int cid, String cname, LocalDate endDate, String fcName, List<Student> slist) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.endDate = endDate;
		this.fcName = fcName;
		this.slist = slist;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getFcName() {
		return fcName;
	}
	public void setFcName(String fcName) {
		this.fcName = fcName;
	}
	public List<Student> getSlist() {
		return slist;
	}
	public void setSlist(List<Student> slist) {
		this.slist = slist;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", endDate=" + endDate + ", fcName=" + fcName + ", slist="
				+ slist + "]";
	}
	
}
