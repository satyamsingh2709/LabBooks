package com.cg.lb2.ui;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise3 {
	public static int[] getSorted(int arr[], int num) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		return (arr);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements:");

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();

		}
		scan.close();
		getSorted(arr, arr.length);
		for (int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
