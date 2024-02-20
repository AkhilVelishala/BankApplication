package com.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.Bank;
import com.web.model.Deposite;
import com.web.model.Transfer;
import com.web.model.Withdraw;
import com.web.service.Service;


@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired 
	private Service service;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
//==============================account=========================================	
	@RequestMapping("/account")
	public String Accountfrom()
	{
		return "accountform";
		}
	
	@RequestMapping("/accounturl")
	public String AccountPage(Bank bank) {
	service.accountCreation(bank);
		return "success";	
	}
//=================================balance===================================================================================================================================================================================================================================================================	
	@RequestMapping("/balance")
	public String Balancefrom()
	{
		return "balanceform";
		
	}
 @RequestMapping("/balanceurl")
 public String balance( @RequestParam String accountNumber,@RequestParam String name,@RequestParam String password,ModelMap model) {
     Bank details	  = service.Balancefrom(accountNumber, name, password);
	
     if(details!=null)
     {
    	 model.put("data", details);
    	 return "balancedata";
     }
     else {
	 return "redirect:balanceform";
	}
  }
//=================================DEPOSIT===================================================================================================================================================================================================================================================================	

 @RequestMapping("/deposit")
 public String depositform()
 {
	return "depositform";
	 
 }
 @RequestMapping("/depositurl")
 public String deposit( @RequestParam String accountNumber,@RequestParam String name, @RequestParam double amount,@RequestParam String password,ModelMap model) {
	Deposite details= service.depositfrom(accountNumber, name, amount, password);
	 if(details!=null)
	 {
		 model.put("data", details);
		 return "depositdata";
	 }
	 else {
		
	 
	return "redirect:depositform";
	 }
	 
 }





//=================================withdraw===================================================================================================================================================================================================================================================================	

@RequestMapping("/withdraw")
public String withdrawform()
{
	return "withdrawform";
	 
}
@RequestMapping("/withdrawurl")
public String withdraw( @RequestParam String accountNumber,@RequestParam String name, @RequestParam double amount,@RequestParam String password,ModelMap model) {
	Withdraw details= service.withdrawfrom(accountNumber, name, amount, password);
	 if(details!=null)
	 {
		 model.put("data", details);
		 return "withdrawdata";
	 }
	 else {
		
	 
	return "redirect:withdrawform";
	 }
}

	 
//=================================TRANSFER===================================================================================================================================================================================================================================================================	

@RequestMapping("/transfer")
public String transferform()
{
	return "transferform";
	}

@RequestMapping("/transferurl")
public String transfer( @RequestParam String accountNumber,@RequestParam String name, @RequestParam double amount,@RequestParam String password,@RequestParam String taccountNo, ModelMap model)
{ 
	Transfer details = service.transferfrom(accountNumber, name, amount, password, taccountNo);
	if(details!=null)
	{
		model.put("data", details);
		return "transferdata";
	}
	else {
	return "redirect:transferform";
	}
   }

//=================================close acc===================================================================================================================================================================================================================================================================	
@RequestMapping("/close")
public String closeform() {
	return "closeform";
}
@RequestMapping("/closeurl")
public String close( @RequestParam String accountNumber,@RequestParam String name,@RequestParam String password,ModelMap model)
{
Bank details	 = service.closefrom(accountNumber, name, password);
if(details!=null)
{
	model.put("data", details);
	return "closedata";
	}
else {


return "redirect:closeform";
}
	}

}