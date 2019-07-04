package com.sapient.pe.model;

public class CurrentAccount extends BankAccount {

	private final double MIN_ACCOUNT_BALANCE = 25000;
	
	public CurrentAccount(Person person, Account_Type account_type, Address add) {
		super(person, account_type, add);
	}
	
	public double withdraw(double amount) {
		if((this.balance-amount) >= MIN_ACCOUNT_BALANCE) {
			this.balance -= amount;
			System.out.println("Withdrawal successful...");
			return amount;
		}
		else {
			System.out.println("Insufficient Minimum Balance");
			return -1;
		}
	}
	
	public void deposit(double amount) {
			this.balance += amount;
			System.out.println("Deposit successful...");
	}
	
	
}
