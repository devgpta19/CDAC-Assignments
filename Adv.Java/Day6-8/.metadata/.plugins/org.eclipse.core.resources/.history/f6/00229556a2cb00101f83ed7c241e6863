package com.demo.services;

import java.sql.ResultSet;
import java.util.Set;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	ProductDao pdao = new ProductDaoImpl();
	@Override
	public Set<Integer> fetchAllCat() {
		return pdao.getAllCat();
	}
	@Override
	public ResultSet fatchProduct(int catID) {
		
		return pdao.fatchProduct(catID);
	}

}
