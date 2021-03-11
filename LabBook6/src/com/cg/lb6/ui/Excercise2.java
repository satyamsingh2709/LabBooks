package com.cg.lb6.ui;

import java.util.HashMap;

public class Excercise2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','b','c','c','a','a','z'};
		System.out.println(countChar(arr));
	}
	public static HashMap<Character, Integer >  countChar(char[] arr){
		HashMap<Character, Integer> chatFreq = new HashMap<Character, Integer>();
		for (char c : arr) {
			if (chatFreq.containsKey(c)) {
				
				chatFreq.put(c, chatFreq.get(c)+1);
			}
			else
			{
				chatFreq.put(c, 1);
			}
			
		}
		return chatFreq;
	}

}
