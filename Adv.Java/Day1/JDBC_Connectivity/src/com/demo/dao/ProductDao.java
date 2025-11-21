package com.demo.dao;

import com.demo.beans.Product;

public interface ProductDao {

	boolean save(Product p);

	void startConnection();

	void display();

	boolean updateSalary(int id, double price);

	boolean removeById(int id);

	Product getById(int id);
	
}
