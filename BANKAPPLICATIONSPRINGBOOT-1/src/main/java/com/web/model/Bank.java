package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Bank {
@Id
private String accountNumber;
private String name;
private String password;
private double amount;
private String address;
private long mobile;

@Enumerated(EnumType.STRING)
private Accountstatus status = Accountstatus.active;

public enum Accountstatus{
	active,inactive
}

public Bank() {
	super();
}

public Bank(String accountNumber, String name, String password, double amount, String address, long mobile,
		Accountstatus status) {
	super();
	this.accountNumber = accountNumber;
	this.name = name;
	this.password = password;
	this.amount = amount;
	this.address = address;
	this.mobile = mobile;
	this.status = status;
}

public String getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public long getMobile() {
	return mobile;
}

public void setMobile(long mobile) {
	this.mobile = mobile;
}

public Accountstatus getStatus() {
	return status;
}

public void setStatus(Accountstatus status) {
	this.status = status;
}

@Override
public String toString() {
	return "Bank [accountNumber=" + accountNumber + ", name=" + name + ", password=" + password + ", amount=" + amount
			+ ", address=" + address + ", mobile=" + mobile + ", status=" + status + "]";
}


}
