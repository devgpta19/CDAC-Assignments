package com.demo.services;

import com.demo.beans.Product;
import com.demo.dao.CartDao;
import com.demo.dao.CartDaoImpl;

public class CartServiceImpl implements CartService {

	private CartDao cdao;

	public CartServiceImpl() {

		cdao = new CartDaoImpl();

	}

	@Override
	public int addProduct(Product p) {
		return cdao.addToCart(p);
	}

}
