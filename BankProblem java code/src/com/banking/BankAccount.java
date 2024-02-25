package com.banking;

import java.time.LocalDate;

public class BankAccount
{
	private int acctNo;
	private String customerName;
	private AccountType acType;
	private int balance;
	private LocalDate creationDate;
	private LocalDate lastTxDate;
	private boolean active;
	
	public BankAccount(int acctNo, String customerName, AccountType acType, int balance, LocalDate creationDate) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.acType = acType;
		this.balance = balance;
		this.creationDate = creationDate;
	}
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public int getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public AccountType getAcType() {
		return acType;
	}
	public void setAcType(AccountType acType) {
		this.acType = acType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDate getLastTxDate() {
		return lastTxDate;
	}
	public void setLastTxDate(LocalDate lastTxDate) {
		this.lastTxDate = lastTxDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", acType=" + acType + ", balance="
				+ balance + ", creationDate=" + creationDate + ", lastTxDate=" + lastTxDate + ", active=" + active
				+ "]";
	}
	
	public  int withdraw(int amount)
	{
		return balance-=amount;
	}
	
	public  int deposit(int amount)
	{
		return balance-=amount;
	}
	
	public void transferFunds(int transferAmount, BankAccount dest)
	{
		this.withdraw(transferAmount);
		dest.deposit(transferAmount);
	}
	
	
	
	
}
