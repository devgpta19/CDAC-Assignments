package com.demo.test;

import java.util.Scanner;

import com.demo.hashtable.HashTable;

public class TestHashTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashTable htbl = new HashTable();
		int ch;
		do {
			System.out.println("1. Add new data\n" + "2. Remove data\n" + "3. Display HashTable\n"
					+ "4. Search data in Hash table\n" + "5. exit\n" + "----------------------------------\n"
					+ "Enter your choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1 -> {
				System.out.println("Enter Value:");
				int val = sc.nextInt();
				boolean status = htbl.insertData(val);
				if (status) {
					System.out.println("---------------------------------------");
					System.out.println("Data inserted Successfully...");
					System.out.println("---------------------------------------");
				} else {
					System.out.println("---------------------------------------");
					System.out.println("Something went wrong.");
					System.out.println("---------------------------------------");
				}
			}
			case 2 -> {
				System.out.println("Enter data that you want to remove:");
				int num = sc.nextInt();
				boolean status = htbl.removeData(num);
				if (status) {
					System.out.println("---------------------------------------");
					System.out.println("Data Removed Successfully...");
					System.out.println("---------------------------------------");
				} else {
					System.out.println("---------------------------------------");
					System.out.println("Something went wrong.");
					System.out.println("---------------------------------------");
				}
			}
			case 3 -> {
				System.out.println("---------------------------------------");
				htbl.display();
				System.out.println("---------------------------------------");
			}

			case 4 -> {
				System.out.println("Enter data that you want to search:");
				int data = sc.nextInt();
				boolean status = htbl.searchData(data);
				if (status) {
					System.out.println("---------------------------------------");
					System.out.println(data + " Data found");
					System.out.println("---------------------------------------");
				} else {
					System.out.println("---------------------------------------");
					System.out.println(data + " Not found");
					System.out.println("---------------------------------------");
				}
			}
			case 5 -> {
				System.out.println("---------------------------------------");
				System.out.println("Thank You for visiting...!");
				System.out.println("---------------------------------------");
				sc.close();
			}
			}
		} while (ch != 5);

	}

}
