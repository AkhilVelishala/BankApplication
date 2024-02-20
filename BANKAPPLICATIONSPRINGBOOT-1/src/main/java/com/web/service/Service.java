package com.web.service;



import com.web.model.Bank;
import com.web.model.Deposite;
import com.web.model.Transfer;
import com.web.model.Withdraw;

public interface Service {
	public Bank accountCreation(Bank bank);
	public Bank Balancefrom( String accountNumber, String  name, String password);
	public Deposite depositfrom( String accountNumber, String  name,double amount, String password);
	public Withdraw withdrawfrom( String accountNumber, String  name,double amount, String password);
	public Transfer transferfrom( String accountNumber, String  name,double amount, String password,String taccountNo );
	public Bank closefrom( String accountNumber, String  name, String password);
}
