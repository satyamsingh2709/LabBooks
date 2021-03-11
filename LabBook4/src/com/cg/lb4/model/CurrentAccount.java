package com.cg.lb4.model;
public class CurrentAccount extends Account{
	static final double OVERDRAFTLIMIT = 500000;
	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}
	
	public void deposite(double bal) {
		
		if(this.balance+bal > OVERDRAFTLIMIT)
		{
			System.out.println("You cannot deposit this much amount Maximum account balance should be 5,00,000");
		}
		
		this.balance += bal;
	}
	

}