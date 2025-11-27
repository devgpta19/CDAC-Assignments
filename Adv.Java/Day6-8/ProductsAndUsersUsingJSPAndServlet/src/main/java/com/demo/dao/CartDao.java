package com.demo.dao;

import java.util.Set;

import com.demo.beans.Product;

public interface CartDao {

	Set<Product> addToCart(Product p);

}
