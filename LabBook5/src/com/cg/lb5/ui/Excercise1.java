package com.cg.lb5.ui;

import java.util.Scanner;

public class Excercise1 {

public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
		getAge();
		}
		catch (AgeException minor) {
			System.out.println(minor.getMessage());
		}
	}

	public static void getAge() throws AgeException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		
			if (age < 15)
				throw new AgeException("you must have alteast 15 Years old");
			else
				System.out.println("ohhh greate you crossed 15 years");

	}

}

class AgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public AgeException(String msg) {
		super(msg);
		
	}

}
