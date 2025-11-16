package com.demo.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public class CustomerDaoImpl implements CustomerDao {

	Map<Customer, List<Item>> ci = new TreeMap<Customer, List<Item>>();
	
	@Override
	public void readFile(String fname) {
		File f = new File(fname);
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream (f))){
			try {
				while(true) {
					ci = (Map<Customer, List<Item>>) ois.readObject();
				}
			} catch (FileNotFoundException e) {
				System.out.println("Not Able Find "+fname+" file");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean saveCustomer(Customer customer, List<Item> itm) {
		if(customer!=null) {
			ci.put(customer, itm);
			return true;
		}
			
		return false;
	}

	@Override
	public Map<Customer, List<Item>> showAll() {
		return ci;
	}
	
}
