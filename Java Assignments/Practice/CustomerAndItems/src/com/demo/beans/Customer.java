package com.demo.beans;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;

public class Customer implements Comparable<Customer>, Serializable {
	private String cid;
	private String cname;
	private String cmob;
	private int count = 1;
	public Customer() {
		super();
	}

	public Customer(String cname, String cmob) {
		super();
		this.cid = generateId();
		this.cname = cname;
		this.cmob = cmob;
	}

	private String generateId() {
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		
		String str = "C"+year+month+(10000+count);
		count++;
		
		return str;
	}

	public String getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCmob() {
		return cmob;
	}

	public void setCmob(String cmob) {
		this.cmob = cmob;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(cid, other.cid);
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cmob=" + cmob + ", count=" + count + "]";
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
}
