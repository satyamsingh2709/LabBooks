package com.cg.lb6.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Excercise6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> voterList = new HashMap<Integer, Integer>();
		Scanner scanner = new Scanner(System.in);
		int noOfVoters = scanner.nextInt();
		for(int iter=0;iter<noOfVoters;iter++) {
			int voterid = scanner.nextInt();
			int age = scanner.nextInt();
			voterList.put(voterid, age);
		}
		
		System.out.println(votersList(voterList));
	}
	public static List<Integer> votersList(Map<Integer, Integer> map){
		Set<Integer> voterIds = map.keySet();
		List<Integer> voterList = new ArrayList<Integer>();
		for(Integer voter:voterIds) {
			if(map.get(voter)>=18) {
				voterList.add(voter);
			}
		}
		return voterList;
	}
}
