package com.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

	private int cId;
	private String cName;
	private long mobileNumber;
	private String productName;
	private double price;
	private double quantity;
	private double total;
	private double discount;
	private double gst_amount;
	private double invoice_bill;
	
	public Product() {
		super();
		}

	public Product(int cId, String cName, long mobileNumber, String productName, double price, double quantity,
			double total, double discount, double gst_amount, double invoice_bill) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.mobileNumber = mobileNumber;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.discount = discount;
		this.gst_amount = gst_amount;
		this.invoice_bill = invoice_bill;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getGst_amount() {
		return gst_amount;
	}

	public void setDst_amount(double gst_amount) {
		this.gst_amount = gst_amount;
	}

	public double getInvoice_bill() {
		return invoice_bill;
	}

	public void setInvoice_bill(double invoice_bill) {
		this.invoice_bill = invoice_bill;
	}

	@Override
	public String toString() {
		return "Product [cId=" + cId + ", cName=" + cName + ", mobileNumber=" + mobileNumber + ", productName="
				+ productName + ", price=" + price + ", quantity=" + quantity + ", total=" + total + ", discount="
				+ discount + ", dst_amount=" + gst_amount + ", invoice_bill=" + invoice_bill + "]";
	}


}
