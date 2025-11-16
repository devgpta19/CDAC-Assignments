package com.demo.beans;

public class Item {
	private int iid;
	private String iname;
	private double price;
	private int quant;
	private int stock;
		
	public Item() {
		super();
	}

	public Item(int iid, String iname, double price, int quant, int stock) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.price = price;
		this.quant = quant;
		this.stock = stock;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Item [iid=" + iid + ", iname=" + iname + ", price=" + price + ", quant=" + quant + ", stock=" + stock
				+ "]";
	}
	
}
