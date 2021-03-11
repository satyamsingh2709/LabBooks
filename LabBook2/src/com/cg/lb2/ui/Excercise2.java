package com.cg.lb2.ui;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise2 {

	public static void main(String[] args) {
		int count;
		String temp;
		Scanner scan = new Scanner(System.in);

		count = scan.nextInt();

		String str[] = new String[count];

		int num = (int) Math.ceil(count / 2);
		for (int i = 0; i < count; i++) {
			str[i] = scan.nextLine();
		}
		scan.close();
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.print(str[i] + " ");
		}
	}

}
