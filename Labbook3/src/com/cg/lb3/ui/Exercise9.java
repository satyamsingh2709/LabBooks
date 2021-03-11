package com.cg.lb3.ui;

import java.util.Scanner;

import java.time.LocalDate;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Exercise9 {

	static void timeDifference(LocalDate given, LocalDate now){
		System.out.println("hello");
		Period diff = Period .between(given, now); 

		System.out.print( "Difference "+ "between two dates is: "); 

		System.out.printf( "%d years, %d months"+ " and %d days ", diff.getYears(), diff.getMonths(), diff.getDays()); 
	}
	
	public static void main(String[] args) {
		LocalDate now= LocalDate.now();
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate givenDate = LocalDate.parse(sc.next(), formatter);
		timeDifference(givenDate,now);
		
		
	}
}