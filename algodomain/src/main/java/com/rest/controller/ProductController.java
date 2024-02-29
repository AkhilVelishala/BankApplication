package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Product;
import com.rest.service.ProductServiceinter;

@RestController
public class ProductController {
	@Autowired
	private ProductServiceinter service;
	
	@PostMapping("/save")
	public String save(@RequestBody Product product )
	{  
		Product p  = service.save(product);
	String message = null;
	if(p!=null) {
		message = "data inserted successfully";
	}
	else {
		message = "data not inserted";	
	}
		return message;
		
	}
	
	@GetMapping("/get/{productId}")
	public Product get(@PathVariable int productId)
	{
	Product product	 = service.getone(productId);
	return product;	
	}

}
