package com.jspiders.multithreading.resource;

public class Amount {
	private double accountBalance;
	public Amount(double accountBalance)
	{
		this.accountBalance;
	}
	public void deposite(double amount) {
		accountBalance +=amount;
		System.out.println("Amount of ruppes"+ amount +"has been credited");
		System.out.println("updated amount balance="+ accountBalance);
	}
	public void withdraw(double amount) {
		if(amount > accountBalance)
		{
			System.out.println("Insufficient account balance");
		}
		else
		{
		accountBalance -=amount;
		System.out.println("Amount of ruppes"+ amount +"has been credited");
		System.out.println("updated amount balance="+ accountBalance);
		}
	}
}
