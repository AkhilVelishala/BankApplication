package com.web.model;

public class Deposite {
	private double myaccountbalance;
	private double depositebalance;
	private double afterdepositbalance;
	
	public Deposite() {
		super();
		}

	public Deposite(double myaccountbalance, double depositebalance, double afterdepositbalance) {
		super();
		this.myaccountbalance = myaccountbalance;
		this.depositebalance = depositebalance;
		this.afterdepositbalance = afterdepositbalance;
	}

	public double getMyaccountbalance() {
		return myaccountbalance;
	}

	public void setMyaccountbalance(double myaccountbalance) {
		this.myaccountbalance = myaccountbalance;
	}

	public double getDepositebalance() {
		return depositebalance;
	}

	public void setDepositebalance(double depositebalance) {
		this.depositebalance = depositebalance;
	}

	public double getAfterdepositbalance() {
		return afterdepositbalance;
	}

	public void setAfterdepositbalance(double afterdepositbalance) {
		this.afterdepositbalance = afterdepositbalance;
	}

	@Override
	public String toString() {
		return "Deposite [myaccountbalance=" + myaccountbalance + ", depositebalance=" + depositebalance
				+ ", afterdepositbalance=" + afterdepositbalance + "]";
	}



}
