package com.demo.dao;

import java.util.Set;

import com.demo.beans.Items;

public interface ItemsDao {

	Set<Items> getItemById(String str);

	Set<Items> addItems();

	void save(Set<Items> iset, int cid);

	Set<Items> getAllByCartId(int cid);

	void save(Items i);
	
}
