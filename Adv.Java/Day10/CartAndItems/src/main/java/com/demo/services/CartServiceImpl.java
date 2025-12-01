package com.demo.services;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Cart;
import com.demo.beans.Items;
import com.demo.dao.CartDao;
import com.demo.dao.CartDaoImpl;
import com.demo.dao.ItemDaoImpl;
import com.demo.dao.ItemsDao;

public class CartServiceImpl implements CartService {

	private CartDao cdao;
	private ItemsDao idao = new ItemDaoImpl();
	private ItemServices iservice = new ItemServicesImpl();
	Scanner sc = new Scanner(System.in);

	public CartServiceImpl() {
		cdao = new CartDaoImpl();
	}

	public boolean makeACart() {
		System.out.println("Enter Cart Id : ");
		int cid = sc.nextInt();
		System.out.print("Enter a Customer Name");
		String custName = sc.next();

		System.out.println(".....Add Items to the cart.....");
		Set<Items> iset = iservice.addItems(cid);

		if (iset != null) {
			System.out.println("Items Added SuccessFully To the cart");

			Cart cart = new Cart();
			cart.setCartid(cid);
			cart.setCustname(custName);
			cart.setIset(iset);

			cdao.save(cart);

			return true;
		}
		return false;
	}

	public void displayCart(int cid) {
		cdao.display(cid);
	}

	public void displayCartItems(int cid1) {
		cdao.displayCartItems(cid1);
	}

}
