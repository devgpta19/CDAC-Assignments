package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.dao.CustomerDao;
import com.demo.dao.CustomerDaoImpl;
import com.demo.exception.CustomerNotAddedException;
import com.demo.exception.QuantityException;

public class CustomerServiceImpl implements CustomerService {

	private static CustomerDao cdao;
	static {
		cdao = new CustomerDaoImpl();
	}

	Scanner sc = new Scanner(System.in);

	@Override
	public void readFile(String fname) {
		cdao.readFile(fname);
	}

	@Override
	public boolean addCustomer() {
		System.out.println("Enter Customer Name : ");
		String nm = sc.nextLine();
		System.out.println("Enter Mobile No.");
		String mob = sc.nextLine();
		String y = "n";
		List<Item> itm = new ArrayList<>();
		do {
			System.out.println("Do You Want to add Item to this Customer ? y or n");
			y = sc.nextLine();
			switch (y) {
			case "y" -> {
				System.out.println("Enter Item Id");
				int iid = sc.nextInt();
				System.out.println("Enter Item Name");
				sc.nextLine();
				String iname = sc.nextLine();
				System.out.println("Enter Price of Item");
				double price = sc.nextDouble();
				System.out.println("Enter Item Quantity");
				int q = sc.nextInt();
				System.out.println("Enter Items in Stock");
				int s = sc.nextInt();
				sc.nextLine();

				try {
					if (q > s || q < 0)
						throw new QuantityException("Quantity is -ve or greater then Stock.");

					itm.add(new Item(iid, iname, price, q, s));
				} catch (QuantityException e) {
					System.out.println("QuantityException Occur : " + e.getMessage());
					return false;
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}

				

			}
			default -> {
				System.out.println("Wrong Input");
			}
			}
		} while (!y.equals("n"));

		try {
			if (y.equals("n") && itm.isEmpty())
				throw new CustomerNotAddedException("Can not Add Customer.");
			cdao.saveCustomer(new Customer(nm, mob), itm);
		} catch (CustomerNotAddedException e) {
			System.out.println("CustomerNotAddedException Occur : ");
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	@Override
	public Map<Customer, List<Item>> displayAll() {
		return cdao.showAll();
	}

}
