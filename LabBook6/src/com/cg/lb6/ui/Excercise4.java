package com.cg.lb6.ui;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Excercise4 {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap <Integer,Integer> studentResult  = new HashMap<Integer,Integer>();
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the number of student");
		int noOfStudent = scanner.nextInt();
		for(int iter=0;iter<noOfStudent;iter++) 
		{
			int regNumber = scanner.nextInt();
			int marks = scanner.nextInt();
			studentResult.put(regNumber, marks);
		}
		System.out.println(getStudent(studentResult));
	}

	public static HashMap<Integer, String> getStudent(HashMap<Integer, Integer> studentResult)
	
	{
		
		HashMap<Integer, String> studentGradeCard = new HashMap<Integer, String>();
		Set<Integer> studentRegNumber = studentResult.keySet();
		
		
		System.out.println(studentRegNumber);
		
		
		for (Integer obj : studentRegNumber) {
			if(studentResult.get(obj)>=90) {
				studentGradeCard.put(obj, "Gold");	
			}
			else if(studentResult.get(obj)>=80) {
				studentGradeCard.put(obj, "Silver");
				
			}
			else if(studentResult.get(obj)>=70) {
				studentGradeCard.put(obj, "Bronze");
				
			}
			
	}
		
		return studentGradeCard;
	}

}
