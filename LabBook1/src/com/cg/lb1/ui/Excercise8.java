package com.cg.lb1.ui;

import java.util.Scanner;

public class Excercise8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		boolean powOfTwo=false;
		powOfTwo=checkNumber(num);
		if(powOfTwo) {
			System.out.println("Power of two");
		}
		else {
			System.out.println("Not a power of two");
		}
		

	}

	private static boolean checkNumber(int num) {
		if(num==0)
		    return false;
		 
		return (int)(Math.ceil((Math.log(num) / Math.log(2)))) == 
		       (int)(Math.floor(((Math.log(num) / Math.log(2)))));
	}

}
