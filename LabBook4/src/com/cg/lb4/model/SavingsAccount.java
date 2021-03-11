package com.cg.lb4.model;
public class SavingsAccount extends Account {
	static final int MINBALANCE = 500;

	public SavingsAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
	}

	

	@Override
	public void withdraw(double bal) {

		if ((this.balance - bal) <= MINBALANCE) {
			System.out.println("You dont have sufficiant balance to withdraw  MIN BALANCE :Rs.500");
		} else {
			this.balance -= bal;
		}

	}
}