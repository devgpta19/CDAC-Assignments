package com.demo.services;

import java.sql.ResultSet;
import java.util.List;
import java.util.Set;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	ProductDao pdao = new ProductDaoImpl();
	@Override
	public Set<Integer> fetchAllCat() {
		return pdao.getAllCat();
	}
	@Override
	public List<Product> fatchProduct(int catID) {
		
		return pdao.fatchProduct(catID);
	}

}
