package com.cg.lb1.ui;

import java.util.Scanner;

public class Excercise7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		boolean increasingNumber;
		increasingNumber=checkNumber(num);
		if(increasingNumber) {
			System.out.println("Increasing number");
		} else {
			System.out.println("Not increasing number");
		}

	}

	private static boolean checkNumber(int num) {
		String number = String.valueOf(num); 
	    int length = number.length();
	    for (int i = 0; i < length-1; i++) {
	        if(number.charAt(i) <= number.charAt(i+1)) { 
	            continue; 
	        }
	        else 
	        	return false; 
	        }
	    return true; 
	}



}
