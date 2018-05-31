package com.gc.coffeeshop.CoffeeShop.dao;

import java.util.List;

public interface BaseDao<T> {

	public T findById(int id);
	
	public List<T> listAll();
	
	public T update(T obj);
	
	public void delete(int id);
}
