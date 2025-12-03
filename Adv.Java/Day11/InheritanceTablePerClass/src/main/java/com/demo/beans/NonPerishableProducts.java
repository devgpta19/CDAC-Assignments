package com.demo.beans;
import javax.persistence.Entity;

@Entity
public class NonPerishableProducts extends Product {
	
	private int garentee;

	public NonPerishableProducts() {
		super();
	}

	public NonPerishableProducts(int pid, String pname, int qty, double price, int garentee) {
		super(pid, pname, qty, price);
		this.garentee = garentee;
	}

	public int getGarentee() {
		return garentee;
	}

	public void setGarentee(int garentee) {
		this.garentee = garentee;
	}

	@Override
	public String toString() {
		return super.toString()+"NonPerishableProducts [garentee=" + garentee + "]";
	}
	
}
