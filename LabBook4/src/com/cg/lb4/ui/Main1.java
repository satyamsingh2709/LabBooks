package com.cg.lb4.ui;

import com.cg.lb4.model.CurrentAccount;
import com.cg.lb4.model.Person;
import com.cg.lb4.model.SavingsAccount;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Person smithPersonal = new Person("simth", 56);
		Person kathyPersonal = new Person("kathy", 26);
		SavingsAccount smithSavingAcc = new SavingsAccount(1000, 3000, smithPersonal);
		CurrentAccount kathCurrentAcc = new CurrentAccount(10001, 2000, kathyPersonal);
		smithSavingAcc.withdraw(3000);
		kathCurrentAcc.deposite(2000);
		System.out.println(smithSavingAcc.getBalance());
		System.out.println(kathCurrentAcc.getBalance());

	}

}