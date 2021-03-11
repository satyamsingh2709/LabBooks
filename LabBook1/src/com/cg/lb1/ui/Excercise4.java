package com.cg.lb1.ui;

import java.util.Scanner;

public class Excercise4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		boolean isPrime;
		for(int i=2;i<=num;i++)
		{
			isPrime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				isPrime=false;
				continue;
				
			}
			if(isPrime) {
				System.out.println(i);
			}
		}

	}

}
