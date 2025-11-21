package com.demo.services;

import com.demo.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	void startConnection();

	void display();

	boolean modifysalary(int id, double price);

	boolean deleteById(int id);

	Product findById(int id);

}
