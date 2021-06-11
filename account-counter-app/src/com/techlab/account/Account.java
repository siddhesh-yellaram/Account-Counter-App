package com.techlab.account;

public class Account {
	private int accountNo;
	private double balance;
	private String accName;
	private boolean isWithdrawSuceeded = true;
	private static int count; 
	static {
		count = 0;
	}
	
	public Account(int accountNo, String accName, double balance){
		count += 1;
		this.accountNo = accountNo;
		this.accName = accName;
		this.balance = balance;
	}
	
	public int getAccNo() {
		return accountNo;
	}
	
	public String getAccName() {
		return accName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public int getCount() {
		return count;
	}
	
	public boolean withdraw(double amount) {
		if(this.balance - amount < 500) {
			isWithdrawSuceeded = false;
		}else {
			this.balance -= amount;
		}
		return isWithdrawSuceeded;
	}
	
	public static int headCount() {
		return count;
	}
}
