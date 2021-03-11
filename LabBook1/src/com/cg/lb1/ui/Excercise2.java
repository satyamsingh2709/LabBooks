package com.cg.lb1.ui;

import java.util.Scanner;

public class Excercise2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		switch(str) {
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Ready");
			break;
		case "Green":
			System.out.println("Go");
			break;
			default:
				System.out.println("Wrong Choice");
		}

	}

}
