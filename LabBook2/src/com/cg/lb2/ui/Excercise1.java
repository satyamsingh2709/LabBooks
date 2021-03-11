package com.cg.lb2.ui;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int []arr=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[1]);
		
	}

}
