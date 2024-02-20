package com.web.model;

public class Transfer {
	private String myaccountNumber;
	private double myaccountBalance ;
	private double transferAmount;
	private double myaccountBalanceAfterTransfer;
	private String targetAccountNumber;
	private double targetaccountBalance ;
	private double afterTransferTargetaccountBalance ;
	
	public Transfer() {
		super();
		
	}

	public Transfer(String myaccountNumber, double myaccountBalance, double transferAmount,
			double myaccountBalanceAfterTransfer, String targetAccountNumber, double targetaccountBalance,
			double afterTransferTargetaccountBalance) {
		super();
		this.myaccountNumber = myaccountNumber;
		this.myaccountBalance = myaccountBalance;
		this.transferAmount = transferAmount;
		this.myaccountBalanceAfterTransfer = myaccountBalanceAfterTransfer;
		this.targetAccountNumber = targetAccountNumber;
		this.targetaccountBalance = targetaccountBalance;
		this.afterTransferTargetaccountBalance = afterTransferTargetaccountBalance;
	}

	public String getMyaccountNumber() {
		return myaccountNumber;
	}

	public void setMyaccountNumber(String myaccountNumber) {
		this.myaccountNumber = myaccountNumber;
	}

	public double getMyaccountBalance() {
		return myaccountBalance;
	}

	public void setMyaccountBalance(double myaccountBalance) {
		this.myaccountBalance = myaccountBalance;
	}

	public double getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}

	public double getMyaccountBalanceAfterTransfer() {
		return myaccountBalanceAfterTransfer;
	}

	public void setMyaccountBalanceAfterTransfer(double myaccountBalanceAfterTransfer) {
		this.myaccountBalanceAfterTransfer = myaccountBalanceAfterTransfer;
	}

	public String getTargetAccountNumber() {
		return targetAccountNumber;
	}

	public void setTargetAccountNumber(String targetAccountNumber) {
		this.targetAccountNumber = targetAccountNumber;
	}

	public double getTargetaccountBalance() {
		return targetaccountBalance;
	}

	public void setTargetaccountBalance(double targetaccountBalance) {
		this.targetaccountBalance = targetaccountBalance;
	}

	public double getAfterTransferTargetaccountBalance() {
		return afterTransferTargetaccountBalance;
	}

	public void setAfterTransferTargetaccountBalance(double afterTransferTargetaccountBalance) {
		this.afterTransferTargetaccountBalance = afterTransferTargetaccountBalance;
	}

	@Override
	public String toString() {
		return "Transfer [myaccountNumber=" + myaccountNumber + ", myaccountBalance=" + myaccountBalance
				+ ", transferAmount=" + transferAmount + ", myaccountBalanceAfterTransfer="
				+ myaccountBalanceAfterTransfer + ", targetAccountNumber=" + targetAccountNumber
				+ ", targetaccountBalance=" + targetaccountBalance + ", afterTransferTargetaccountBalance="
				+ afterTransferTargetaccountBalance + "]";
	}

}
