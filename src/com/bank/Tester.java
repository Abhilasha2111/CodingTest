package com.bank;

public class Tester {

	public static void main(String[] args) {
		SavingAccount account= new SavingAccount(2000,2);
		System.out.println(account.withdraw(300));
		System.out.println(account.deposit(500));
		System.out.println(account.showBalance());
	}

}