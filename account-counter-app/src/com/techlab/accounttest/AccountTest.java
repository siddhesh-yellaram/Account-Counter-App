package com.techlab.accounttest;

import com.techlab.account.Account;

public class AccountTest {
	
	static {
		System.out.println("I am inside static block");
	}
	public static void main(String[] args) {
		Account a1 = new Account(101,"A1",5000);
		System.out.println("A1 Count: "+a1.getCount());
		Account a2 = new Account(102, "A2", 450);
		System.out.println("A2 Count: "+a2.getCount());
		Account a3 = new Account(103, "A3", 4500);
		System.out.println("A3 Count: "+a3.getCount());
//		a1.deposit(500);
//		a2.deposit(500);
//		if(a2.withdraw(500)) {
//			createAccount(a2);
//		}else {
//			System.out.println("Insufficient Balance");
//		}
		System.out.println("Head Count: "+Account.headCount());
	}
	public static void createAccount(Account obj) {
		System.out.println("Account No: "+obj.getAccNo());
		System.out.println("Account Name: "+obj.getAccName());
		System.out.println("Account Balance: "+obj.getBalance());
	}
	

}
