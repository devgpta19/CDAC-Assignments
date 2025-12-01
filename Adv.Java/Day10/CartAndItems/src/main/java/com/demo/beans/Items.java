package com.demo.beans;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Items22")
public class Items {
	@Id
	private int iid;
	private String iname;
	private int price;
	private LocalDate expDt;

	@ManyToMany(mappedBy = "iset", cascade=CascadeType.ALL)
	Set<Cart> cset;

	@Override
	public int hashCode() {
		return Objects.hash(iid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		return iid == other.iid;
	}

	public Items() {
		super();
	}

	public Items(int iid, String iname, int price, LocalDate expDt, Set<Cart> cset) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.price = price;
		this.expDt = expDt;
		this.cset = cset;
	}

	public Items(int iid, String iname, int price, LocalDate expDt) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.price = price;
		this.expDt = expDt;
	}

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getExpDt() {
		return expDt;
	}

	public void setExpDt(LocalDate expDt) {
		this.expDt = expDt;
	}

	public Set<Cart> getCset() {
		return cset;
	}

	public void setCset(Set<Cart> cset) {
		this.cset = cset;
	}

	@Override
	public String toString() {
		return "Items [iid=" + iid + ", iname=" + iname + ", price=" + price + ", expDt=" + expDt + "]";
	}
		
}
