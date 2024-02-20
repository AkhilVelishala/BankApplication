package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.model.Bank;
import com.web.model.Bank.Accountstatus;
import com.web.model.Deposite;
import com.web.model.Transfer;
import com.web.model.Withdraw;
import com.web.repository.Bankrepo;
@org.springframework.stereotype.Service

public class ServiceImp implements Service {
	@Autowired
	private Bankrepo repo;

	@Override
	public Bank accountCreation(Bank bank) {
	Bank save	 = repo.save(bank);
		return save;
	}

	@Override
	public Bank Balancefrom(String accountNumber, String name, String password) {
	        Bank data   =  repo.findById(accountNumber).get();
	        if(data.getAccountNumber().equals(accountNumber)&&data.getName().equals(name)&&data.getPassword().equals(password)&&data.getStatus()==Accountstatus.active)
	        {
	        	return data;
	        }
	        else {	
	        	
	        
			return null;
	            }
	     }

	@Override
	public Deposite depositfrom(String accountNumber, String name, double amount, String password) {
	Bank data	 = repo.findById(accountNumber).get();		
	if(data.getAccountNumber().equals(accountNumber)&&data.getName().equals(name)&&data.getPassword().equals(password)&&data.getStatus()==Accountstatus.active)
	{
	double currentAmount = data.getAmount();
	double deposit = currentAmount+amount;
	data.setAmount(deposit);
	repo.save(data);
	
	Deposite deposite = new Deposite();
	deposite.setMyaccountbalance(currentAmount);
	deposite.setDepositebalance(amount);
	deposite.setAfterdepositbalance(deposit);
	return deposite;
	
	}
	else {
	return null;

	}

}

	@Override
	public Withdraw withdrawfrom(String accountNumber, String name, double amount, String password) {
	Bank data= repo.findById(accountNumber).get();
	if(data.getAccountNumber().equals(accountNumber)&&data.getName().equals(name)&&data.getPassword().equals(password)&&data.getStatus()==Accountstatus.active)
	{
		double currentAmount = data.getAmount();
		double withdraw = currentAmount - amount;
	data.setAmount(amount);
	repo.save(data);
	
	Withdraw  withdraw1 =  new Withdraw();
	withdraw1.setBeforewithdrawmyaccountbal(currentAmount);
	withdraw1.setMywithdrawalbalance(amount);
	withdraw1.setAfterwithdrawalAccbal(withdraw);
	return withdraw1;
	}
	else {
		return null;	
	}
	
	}

	@Override
	public  Transfer transferfrom (String accountNumber, String name, double amount, String password, String taccountNo) {
	Bank data= repo.findById(accountNumber).get();
	Bank target = repo.findById(taccountNo).get();
	if(data.getAccountNumber().equals(accountNumber)&& data.getName().equals(name)&&data.getPassword().equals(password)&& target.getAccountNumber().equals(taccountNo)&&data.getStatus()==Accountstatus.active&&target.getStatus()==Accountstatus.active)
	{
		// transfer  withdraw
	double currentbal =data.getAmount();
	double Afterwithdraw =currentbal - amount;
	data.setAmount(Afterwithdraw);
	repo.save(data);
	
	//transfer  deposit
	
	double currentball = target.getAmount();
	double Afterdeposit = currentball + amount;
	target.setAmount(Afterdeposit);
	repo.save(target);
	
	Transfer transfer = new Transfer();
	transfer.setMyaccountNumber(accountNumber);
	transfer.setMyaccountBalance(currentbal);
	transfer.setMyaccountBalanceAfterTransfer(Afterwithdraw);
	transfer.setTargetAccountNumber(taccountNo);
	transfer.setTargetaccountBalance(currentball);
	transfer.setTransferAmount(amount);
	transfer.setAfterTransferTargetaccountBalance(Afterdeposit);
	
	return transfer;
	}
	else {
		
	
	return null;
	}
	}

	@Override
	public Bank closefrom(String accountNumber, String name, String password) {
	Bank data	 = repo.findById(accountNumber).get();
	if(data.getAccountNumber().equals(accountNumber)&&data.getName().equals(name)&&data.getPassword().equals(password))
	
		{
		data.setStatus(Accountstatus.inactive);
		repo.save(data);
		return data;
		}
	else {
	return null;
	}
 }
}

