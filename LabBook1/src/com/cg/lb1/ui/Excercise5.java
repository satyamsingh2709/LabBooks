package com.cg.lb1.ui;

import java.util.Scanner;

public class Excercise5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum;
		sum=calculateSum(num);
		System.out.println(sum);

	}

	private static int calculateSum(int num) {
		int sum=0;
		for(int i=3;i<=num;i++) {
			if(i%3==0&&i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}

}
