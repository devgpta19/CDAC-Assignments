package com.demo.beans;

import java.time.LocalDate;

public class Product {
	private int pId;
	private String pName;
	private int pQty;
	private double pPrice;
	private LocalDate pMfg;
	public Product() {
		super();
	}
	public Product(int pId, String pName, int pQty, double pPrice, LocalDate pMfg) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pQty = pQty;
		this.pPrice = pPrice;
		this.pMfg = pMfg;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpQty() {
		return pQty;
	}
	public void setpQty(int pQty) {
		this.pQty = pQty;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public LocalDate getpMfg() {
		return pMfg;
	}
	public void setpMfg(LocalDate pMfg) {
		this.pMfg = pMfg;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pQty=" + pQty + ", pPrice=" + pPrice + ", pMfg=" + pMfg
				+ "]";
	}
	
	
	
}
