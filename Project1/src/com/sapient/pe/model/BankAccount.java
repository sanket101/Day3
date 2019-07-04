package com.sapient.pe.model;

public abstract class BankAccount {
	
	private static long account_increment = 1000;

	protected double balance = 0;
	private final Person person;
	private Address add;
	//private static final double MIN_ACCOUNT_BALANCE =200;
	private final long account_no; 
	private final Account_Type account_type;
	
	public enum Account_Type {
		SAVINGS_ACCOUNT,
		SALARY_ACCOUNT,
		CURRENT_ACCOUNT
	}
	
	public BankAccount(Person person, Account_Type account_type, Address add)
	{
		BankAccount.account_increment++;
		this.account_no = BankAccount.account_increment;
		this.person = person;
		this.add = add;
		this.account_type = account_type;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public Account_Type getAccount_type() {
		return account_type;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public abstract void deposit(double amount);

	public abstract double withdraw(double amount);

	public long getAccount_no() {
		return account_no;
	}

}