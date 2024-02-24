package com.banking;

public enum AccountType 
{
	SAVING(10000),CURRENT(5000),FD(500000);
	
	private int minBalance;

	private AccountType(int minBalance) {
		this.minBalance = minBalance;
	}

	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}
	
	
}
