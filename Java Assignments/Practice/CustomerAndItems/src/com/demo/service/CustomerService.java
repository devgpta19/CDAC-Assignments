package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface CustomerService {

	void readFile(String fname);

	boolean addCustomer();

	Map<Customer, List<Item>> displayAll();

}
