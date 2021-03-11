package com.cg.lb6.ui;

import java.util.Scanner;

public class Excercise7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfArrayElements = scanner.nextInt();
		int[] arr=new int[noOfArrayElements]; 
		for(int i=0;i<noOfArrayElements;i++) {
			int element = scanner.nextInt();
			arr[i]=element;
		}
		getSorted(arr);

	}
	public static int[] getSorted(int[] arr) {
		int reversedArr[] = {};
		System.out.println(arr.length);
		
		return reversedArr;
	}

}
