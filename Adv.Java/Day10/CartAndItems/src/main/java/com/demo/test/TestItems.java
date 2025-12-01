package com.demo.test;

import java.util.Scanner;

import com.demo.dao.HibernateUtils;
import com.demo.services.CartService;
import com.demo.services.CartServiceImpl;

public class TestItems {

	public static void main(String[] args) {
		
		CartService cservice = new CartServiceImpl();
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		
		do {
			
			System.out.println("1. Add Items to new Cart\n"
					+ "2. Add Items to a particular Cart"
					+ "3. "
					+ "4. EXIT");
			
			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:

				boolean status = cservice.makeACart();
				if (status)
					System.out.println("Your Cart is ready");
				else
					System.out.println("No Items In the Cart");

				break;

			case 2 :

				System.out.println("Enter a Cart ID : ");
				int cid = sc.nextInt();
				cservice.displayCart(cid);
				break;

			case 3 :

				System.out.println("Enter a Cart ID : ");
				int cid1 = sc.nextInt();
				cservice.displayCartItems(cid1);
				break;

			case 4 :
				System.out.println("Thanks");
				HibernateUtils.closeSessionFactory();
				System.exit(0);
				break;
				
			default : 
				System.out.println("Wrong Choice");
			}

		} while (choice != 4);
	}

}