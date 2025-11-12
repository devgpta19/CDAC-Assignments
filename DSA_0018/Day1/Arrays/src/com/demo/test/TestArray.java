package com.demo.test;

import java.util.Scanner;
import java.util.stream.IntStream;

import com.demo.arrays.MyArray;

public class TestArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 1, 8, 6, 55, 4, 7, 2 };

		MyArray m1 = new MyArray();
		MyArray m2 = new MyArray(8);
		MyArray m3 = new MyArray(arr, 13);
		
		System.out.println("--------------------m1------------------");

		m1.add(1);
		m1.add(9);
		m1.add(7);
		m1.add(3);
		m1.add(2);
		m1.add(5);
		m1.add(8);
		m1.getCapacity();
		m1.getSize();

		System.out.println(m1);
		System.out.println(m1.maxVal());
		System.out.println(m1.deleteByvalue(98));
		System.out.println(m1);
		System.out.println(m1.deleteByPos(2)); 
		System.out.println(m1);

		m1.add(4, 9);
		System.out.println(m1);
		int [] arr1 = m1.exchangeIndexValue();
		IntStream.of(arr1).forEach(e->System.out.print(e+","));
		System.out.println();

		System.out.println("--------------------m2------------------");

		m2.add(12);
		m2.add(2);
		m2.add(5);
		m2.add(8);
		m2.add(10);
		m2.getCapacity();
		m2.getSize();
		m2.add(3, 11);
		
		System.out.println(m2);
		System.out.println(m2.maxVal());
		System.out.println(m2.deleteByvalue(10));
		System.out.println(m2);
		System.out.println(m2.deleteByPos(4)); 
		System.out.println(m2);

		m1.add(4, 9);
		System.out.println(m2);
		arr1 = m2.exchangeIndexValue();
		IntStream.of(arr1).forEach(e->System.out.print(e+","));
		System.out.println();
		
		System.out.println("--------------------m3------------------");
		System.out.println(m3);		
		

	}

}
