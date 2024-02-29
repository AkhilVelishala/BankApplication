package com.rest.service;

import com.rest.model.Product;

public interface ProductServiceinter {
	
	public Product save(Product product);
	public Product getone(int productId);

}
