package com.bank;

public class SavingAccount 
{
float balance, interest;
public SavingAccount(float balance, float interest) 
	{
		super();
		this.balance = balance;
		this.interest = interest;
	}
public String withdraw(float amount) 
	{
if (this.balance > amount) 
		{
			this.balance -= amount;
			return "withdraw successful of rs." + amount;
		} else 
		{
			return("insufficient balance");
		}
	}
public String deposit(float amount) 
	{

		if ( amount > 0) 
		{
			this.balance += amount;
			return("deposit successful of rs." + amount);
		} else 
		{
			return("please insert valid amount");
		}
	}
	public String showBalance() 
	{
		return(""+this.balance);
	}
}

