package com.cg.lb6.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Excercise1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the map");
		int elements =scanner.nextInt();
		for(int iter=0;iter<elements;iter++) {
			int rollNum = scanner.nextInt();
			//String name = scanner.nextLine();
			String name = new String(scanner.next());
			map.put(rollNum, name);
		}
		
		System.out.println(getValues(map));
	}
	public static List<String> getValues(HashMap<Integer, String> m) {
		System.out.println(m);
		
		Collection<String> t=m.values();
		
		List<String> l =new ArrayList<String>();
		l.addAll(t);
		Collections.sort(l);
		
		return l;
			
	}


}
