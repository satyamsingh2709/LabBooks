package com.cg.lb1.ui;

import java.util.Scanner;

public class Excercise1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0,rem;
		while(num>0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num/=10;
		}
		System.out.println(sum);
	}

}
