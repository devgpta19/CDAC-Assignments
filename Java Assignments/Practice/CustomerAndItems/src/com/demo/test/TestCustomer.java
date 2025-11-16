package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

public class TestCustomer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CustomerService cservice = new CustomerServiceImpl();

		int choice = 0;
		
		System.out.println("Enter File Name, You Want To Open");
		String fname = sc.nextLine();
		
		cservice.readFile(fname);

		do {

			System.out.println("1. Add Customer\n2. Display All\n"
					+ "3. Find Customer By ID\n4. Find Coustomer by Name\n5. Sort By Name\n"
					+ "6. Add Item To Particuar Customer\n7. Delete Item from Particular Customer\n"
					+ "8. Delete Customer by ID\n9. Save To File\n10. Generate Bill\n11. Exit\n12. Display ALL");
			System.out.println("####################################################");
			System.out.println("Enter your Choice");

			choice = sc.nextInt();

			switch (choice) {

			case 1 -> {
				boolean status = cservice.addCustomer();
				if (status)
					System.out.println("Customer Added Successfully");
				else
					System.out.println("Not Able to Add Customer Something went Wrong.");
			}
			case 2 -> {
				Map<Customer, List<Item>> cusItm = cservice.displayAll();
				if (cusItm != null) {
					Set<Customer> keys = (Set<Customer>) cusItm.keySet();
					for (Customer mm : keys) {
						System.out.println(mm + "" + cusItm.get(mm));
					}					
				} else
					System.out.println("Not Able to Add Customer Something went Wrong.");
			}
			
			}

		} while (choice != 11);

	}

}
