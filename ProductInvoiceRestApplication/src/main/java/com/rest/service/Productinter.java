package com.rest.service;

import java.util.List;

import com.rest.model.Product;

public interface Productinter {
	public Product save(Product product);
	public Product getone(int cId);
	public void deletebyId(int cId);
	public List<Product> getAllrecord();
	public Product update(Product product,int cId);

}
