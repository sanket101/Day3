package com.sapient.pe.model;

public class SavingsAccount extends BankAccount{

	private final double MIN_ACCOUNT_BALANCE = 10000;
	private final double WITHDRAWAL_LIMIT = 25000;
	private final double DEPOSIT_LIMIT = 50000;
	
	public SavingsAccount(Person person, Account_Type account_type, Address add) {
		super(person, account_type, add);
	}
	
	public double withdraw(double amount) {
		if((this.balance-amount) >= MIN_ACCOUNT_BALANCE && amount <= WITHDRAWAL_LIMIT) {
			this.balance -= amount;
			System.out.println("Withdrawal successful...");
			return amount;
		}
		else {
			System.out.println("Insufficient Minimum Balance OR Withdrawal Limit Reached!");
			return -1;
		}
	}
	
	public void deposit(double amount) {
		if(amount <= DEPOSIT_LIMIT) {
			this.balance += amount;
			System.out.println("Deposit successful...");
		}
		else {
			System.out.println("Deposit Limit Reached");
		}
	}
}
