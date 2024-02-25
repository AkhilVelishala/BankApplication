package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Product;
import com.rest.service.Productinter;

@RestController
public class ProductController {
	@Autowired
	private Productinter service;
	
	@PostMapping("/save")
	public String save( @RequestBody Product product)
	{
	Product p	  = service.save(product);
	String message = null;
	if(p!=null)
	{
		message ="data inserted successfully";
	}
	else {
		message= "data not inserted";
	}
		return message;
		
	}
	
	@GetMapping("/get/{cId}")
	public Product get(@PathVariable int cId)
	{
	Product p	 = service.getone(cId);
	return p;
		
	}
	@DeleteMapping("/delete/{cId}")
	public String delete(@PathVariable int cId)
	{
		   service.deletebyId(cId);
		   String message ="data delted";
		return message;
		
	}
	@GetMapping("/getAll")
	public List<Product> getAllrecord() {
	List<Product>all	 =  service.getAllrecord();
		return  all;
		
	}
	
	@PutMapping("/update/{cId}")
	public String update(@RequestBody Product product,@PathVariable int cId)
	{
		
	Product p 	 = service.update(product,cId);
	String message =null;
	if(p!=null)
	{
	message = "updated";	
	}
	else {
		message = "not updated";
	}
		return message;
		
	}
	
	
	
	
	
	
	

}
