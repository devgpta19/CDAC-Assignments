package com.demo.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Items;
import com.demo.dao.ItemDaoImpl;
import com.demo.dao.ItemsDao;

public class ItemServicesImpl implements ItemServices {
	ItemsDao idao = new ItemDaoImpl();

//	public boolean addItems(int cid) {
	public Set<Items> addItems(int cid) {
		Scanner sc = new Scanner(System.in);
		Set<Items> iset = new HashSet<Items>();
		char ch = 'n';
		do {
			System.out.println("Want to Enter Items in the cart");
			System.out.println("Enter Choice : y/n");
			ch = sc.next().charAt(0);

			if (ch == 'y') {
				System.out.println("Enter Id : ");
				int iid = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Item Name : ");
				String name = sc.nextLine();
				System.out.println("Enter Price : ");
				int price = sc.nextInt();
				sc.nextLine(); 
				System.out.println("Enter ExpDate (dd/MM/yyyy)");
				String dt = sc.next();
				LocalDate ldt = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				iset.add(new Items(iid, name, price, ldt));
				System.out.println("hehe"+iset);
				Items i = new Items(iid, name, price, ldt);				
				idao.save(i);
			} else if (ch == 'n') {
//				idao.save(iset, cid);
				System.out.println("Thank You");
				System.out.println(iset);
				System.out.println(iset);
				return iset;
				
			} else {
				System.out.println("Wrong Choice Re-Enter Choice");
			}
		} while (ch != 'n');

		return null;

	}

}
