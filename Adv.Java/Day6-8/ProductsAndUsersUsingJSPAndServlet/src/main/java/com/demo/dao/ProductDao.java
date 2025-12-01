package com.demo.dao;

import java.sql.ResultSet;
import java.util.List;
import java.util.Set;

import com.demo.beans.Product;

public interface ProductDao {

	Set<Integer> getAllCat();

	List<Product> fatchProduct(int catID);

}
