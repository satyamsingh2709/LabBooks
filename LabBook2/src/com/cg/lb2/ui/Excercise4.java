package com.cg.lb2.ui;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise4 {
	public static int removeDuplicateElements(int arr[], int n){  
		public static int modifyArray(int arr[], int num) {
			if (num == 0 || num == 1) {
				return num;
			}
			int j = 0;
			for (int i = 0; i < num - 1; i++) {
				if (arr[i] != arr[i + 1]) {
					arr[j++] = arr[i];
				}
			}
			arr[j++] = arr[num - 1];
			return j;

	}
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no. of elements:");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter all the elements:");
			
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				
			}
			sc.close();
			
			Arrays.sort(arr);
			int length = arr.length;

			int modArr = modifyArray(arr, length);

			for (int i = modArr - 1; i >= 0; i--) {
				System.out.print(arr[i] + " ");
			}
		}
}


