package com.cg.lb5.ui;

import java.util.Scanner;

public class Excerise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			getName();
		}
		catch(FirstNameException nameError) {
			System.out.println(nameError.getMessage());
		}
		catch(LastNameException nameError) {
			System.out.println(nameError.getMessage());
		}
		
		
	
	}
	public static void getName() throws FirstNameException,LastNameException{
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.nextLine();
		String lastName = scanner.nextLine();
		if ((firstName.length()==0)) {
			throw new FirstNameException("You should not leave your first name as blank !!!");
		}
		if ((lastName.length()==0)) {
			throw new FirstNameException("You should not leave your  last name as blank !!!");
		}
		else {
			System.out.println("hii "+firstName+" "+ lastName);
		
		
		
	}

}
}
class FirstNameException extends Exception{

	private static final long serialVersionUID = 1L;

	public FirstNameException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class LastNameException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LastNameException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

class NameException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NameException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

