package com.demo.beans;

import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Cart22")
public class Cart {
	@Id
	private int cartid;
	private String custname;
	
	@ManyToMany
	Set<Items> iset;
	
	@Override
	public int hashCode() {
		return Objects.hash(cartid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		return cartid == other.cartid;
	}

	public Cart() {
		super();
	}

	public Cart(int cartid, String custname, Set<Items> iset) {
		super();
		this.cartid = cartid;
		this.custname = custname;
		this.iset = iset;
	}

	public Cart(int cartid, String custname) {
		super();
		this.cartid = cartid;
		this.custname = custname;
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public Set<Items> getIset() {
		return iset;
	}

	public void setIset(Set<Items> iset) {
		this.iset = iset;
	}

	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", custname=" + custname + ", iset=" + iset + "]";
	}
		
}
