package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Product;
import com.rest.repository.ProductRepo;
@Service
public class ProductService implements Productinter {
	@Autowired
	private ProductRepo repo;

	@Override
	public Product save(Product product) {
		double total;
		total = product.getQuantity() * product.getPrice();
		double discount;
		double gstamount;
		double invoicebill;
		if(total>2500)
		{
			discount = total * 10/100;
		}
		else if (total>=2500 && total<5000) {
			discount = total * 15/100;
			
		}
		else {
			discount = total * 30/100;
		}
		gstamount = total * 15/100;
		invoicebill = total + gstamount - discount;
		product.setDiscount(discount);
		product.setInvoice_bill(invoicebill);
		product.setTotal(total);
		product.setDst_amount(gstamount);
		repo.save(product);
		return product;
	}

	@Override
	public Product getone(int cId) {
	Product p=	repo.findById(cId).get();
		return p ;
	}

	@Override
	public void deletebyId(int cId) {
		 repo.deleteById(cId);		
	}

	@Override
	public List<Product> getAllrecord() {
 List<Product>getall= repo.findAll();
		return getall;
	}

	@Override
	public Product update(Product product,int cId) {
		Product product2 = repo.findById(cId).get();
		if(product2.getcId()==cId)
			product2.setProductName(product.getProductName());
			product2.setcName(product.getcName());
		product2.setMobileNumber(product.getMobileNumber());
		product2.setPrice(product.getPrice());
		product2.setQuantity(product.getQuantity());
		
		double total;
		total = product2.getQuantity() * product2.getPrice();
		double discount;
		double gstamount;
		double invoicebill;
		if(total>2500)
		{
			discount = total * 10/100;
		}
		else if (total>=2500 && total<5000) {
			discount = total * 15/100;
			
		}
		else {
			discount = total * 30/100;
		}
		gstamount = total * 15/100;
		invoicebill = total + gstamount - discount;
		product2.setDiscount(discount);
		product2.setInvoice_bill(invoicebill);
		product2.setTotal(total);
		product2.setDst_amount(gstamount);
		repo.save(product2);
		
		
		return product2;
	
	}

}
