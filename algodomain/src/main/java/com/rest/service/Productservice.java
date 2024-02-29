package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Charges;
import com.rest.model.Product;
import com.rest.repository.Productrepo;
@Service
public class Productservice implements ProductServiceinter {
	@Autowired
	private Productrepo repo;

	@Override
	public Product save(Product product) {
		double discount=0.0;
		double gst=0.0;
		double deliveryCharge=0.0;
		double finalprice=0.0;
		if(product.getProductcategory().equalsIgnoreCase("electronics"))
		{
			discount = product.getProductPrice()*15/100;
			gst = product.getProductPrice()*18/100;
			deliveryCharge =  350;
			
			

		
		}
		else if(product.getProductcategory().equalsIgnoreCase("homeAppliance"))
		{
			discount = product.getProductPrice()*22/100;
			gst = product.getProductPrice()*24/100;
			deliveryCharge =  800;
			
		}
		else if(product.getProductcategory().equalsIgnoreCase("clothing"))
		{
			discount = product.getProductPrice()*40/100;
			gst = product.getProductPrice()*12/100;
			deliveryCharge =  0;
			
		
		}
		else if(product.getProductcategory().equalsIgnoreCase("furniture"))
		{
			discount = product.getProductPrice()*10/100;
			gst = product.getProductPrice()*18/100;
			deliveryCharge = 300;
			
		}
		finalprice = product.getProductPrice()-discount + gst + deliveryCharge;
		product.setFinalprice(finalprice);
		product.setDiscount(discount);
		
		
		Charges charges = new Charges();
		charges.setDeliverycharge(deliveryCharge);
		charges.setGst(gst);
		product.setCharge(charges);
		repo.save(product);
		return product;	
    }

	@Override
	public Product getone(int productId) {
	Product product	 = repo.findById(productId).get();
	return product;
	
	
	}
}
	

