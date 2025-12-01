package com.demo.services;

import java.sql.ResultSet;
import java.util.List;
import java.util.Set;

import com.demo.beans.Product;

public interface ProductService {

	Set<Integer> fetchAllCat();

	List<Product> fatchProduct(int catID);

}
