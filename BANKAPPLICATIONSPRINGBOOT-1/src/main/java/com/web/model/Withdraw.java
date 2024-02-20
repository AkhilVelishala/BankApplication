package com.web.model;

public class Withdraw {
	private double beforewithdrawmyaccountbal;
	private double mywithdrawalbalance;
	private double afterwithdrawalAccbal;
	
	public Withdraw(double beforewithdrawmyaccountbal, double mywithdrawalbalance, double afterwithdrawalAccbal) {
		super();
		this.beforewithdrawmyaccountbal = beforewithdrawmyaccountbal;
		this.mywithdrawalbalance = mywithdrawalbalance;
		this.afterwithdrawalAccbal = afterwithdrawalAccbal;
	}

	public Withdraw() {
		super();
	
	}

	public double getBeforewithdrawmyaccountbal() {
		return beforewithdrawmyaccountbal;
	}

	public void setBeforewithdrawmyaccountbal(double beforewithdrawmyaccountbal) {
		this.beforewithdrawmyaccountbal = beforewithdrawmyaccountbal;
	}

	public double getMywithdrawalbalance() {
		return mywithdrawalbalance;
	}

	public void setMywithdrawalbalance(double mywithdrawalbalance) {
		this.mywithdrawalbalance = mywithdrawalbalance;
	}

	public double getAfterwithdrawalAccbal() {
		return afterwithdrawalAccbal;
	}

	public void setAfterwithdrawalAccbal(double afterwithdrawalAccbal) {
		this.afterwithdrawalAccbal = afterwithdrawalAccbal;
	}

	@Override
	public String toString() {
		return "Withdraw [beforewithdrawmyaccountbal=" + beforewithdrawmyaccountbal + ", mywithdrawalbalance="
				+ mywithdrawalbalance + ", afterwithdrawalAccbal=" + afterwithdrawalAccbal + "]";
	}

}
