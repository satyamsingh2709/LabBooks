package com.cg.lb4.model;
public class Account {
	long accNum;
	double balance;
	Person accHolder;

	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	// getter setter methods

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	// methods

	public void deposite(double bal) {
		this.balance += bal;

	}

	public void withdraw(double bal) {
		this.balance -= bal;

	}

}
