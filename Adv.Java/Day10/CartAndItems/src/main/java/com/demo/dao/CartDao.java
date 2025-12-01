package com.demo.dao;

import com.demo.beans.Cart;

public interface CartDao {

	void save(Cart cart);

	void display(int cid);

	void displayCartItems(int cid1);

}
