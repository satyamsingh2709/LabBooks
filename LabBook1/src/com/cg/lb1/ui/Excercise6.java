package com.cg.lb1.ui;

import java.util.Scanner;

public class Excercise6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum;
		sum=calculateDifferene(n);
		System.out.println(sum);
	}
	private static int calculateDifferene(int num) {
		int sum1=0,sum2=0,diff;
		for(int i=1;i<=num;i++) {
			sum1+=i*i;
		}
		for(int i=1;i<=num;i++) {
			sum2+=i;
		}
		sum2=sum2*sum2;
		diff=sum1-sum2;
		return diff;
		
	}

}
