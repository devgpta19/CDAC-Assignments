package com.demo.beans;

public class Marks {
	
	private int mark1;	
	private int tMark;
	
	public Marks() {
		super();
	}
	
	public Marks(int mark1, int tMark) {
		super();
		this.mark1 = mark1;
		this.tMark = tMark;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int gettMark() {
		return tMark;
	}

	public void settMark(int tMark) {
		this.tMark = tMark;
	}

	@Override
	public String toString() {
		return "Marks [mark1=" + mark1 + ", tMark=" + tMark + "]";
	}
		
}
