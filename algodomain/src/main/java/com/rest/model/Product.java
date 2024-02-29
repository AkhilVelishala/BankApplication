package com.rest.model;


import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Product {
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	private String productName;
	private String productType;
	private String productcategory;
	private double productPrice;
	private double finalprice;
	private double discount;
	@Autowired
	private Charges charge;
	
	public Product() {
		super();
	}

	public Product(Charges charge, int productId, String productName, String productType, String productcategory,
			double productPrice, double finalprice, double discount) {
		super();
		this.charge = charge;
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.productcategory = productcategory;
		this.productPrice = productPrice;
		this.finalprice = finalprice;
		this.discount = discount;
	}

	public Charges getCharge() {
		return charge;
	}

	public void setCharge(Charges charge) {
		this.charge = charge;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public double getFinalprice() {
		return finalprice;
	}

	public void setFinalprice(double finalprice) {
		this.finalprice = finalprice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Product [charge=" + charge + ", productId=" + productId + ", productName=" + productName
				+ ", productType=" + productType + ", productcategory=" + productcategory + ", productPrice="
				+ productPrice + ", finalprice=" + finalprice + ", discount=" + discount + "]";
	}








}
	