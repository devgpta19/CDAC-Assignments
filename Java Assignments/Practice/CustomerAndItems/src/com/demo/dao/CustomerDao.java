package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface CustomerDao {
	
	void readFile(String fname);

	boolean saveCustomer(Customer customer, List<Item> itm);

	Map<Customer, List<Item>> showAll();

}
