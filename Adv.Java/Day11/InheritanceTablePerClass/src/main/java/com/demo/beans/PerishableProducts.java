package com.demo.beans;
import java.time.LocalDate;
import javax.persistence.Entity;

@Entity
public class PerishableProducts extends Product{
	
	private LocalDate expdt;

	public PerishableProducts() {
		super();
	}

	public PerishableProducts(int pid, String pname, int qty, double price, LocalDate expdt) {
		super(pid, pname, qty, price);
		this.expdt = expdt;
	}

	public LocalDate getExpdt() {
		return expdt;
	}

	public void setExpdt(LocalDate expdt) {
		this.expdt = expdt;
	}

	@Override
	public String toString() {
		return super.toString()+"PerishableProducts [expdt=" + expdt + "]";
	}
	
	
}
