package com.cg.lb6.ui;

import java.util.HashMap;
import java.util.Map;

public class Excercise3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		System.out.println(getSquares(arr));
	}
	public static Map<Integer, Integer> getSquares(int[] arr){
		Map<Integer, Integer> squares = new HashMap<Integer, Integer>();	
		for (Integer num : arr) {
			squares.put(num, (num*num));
		}
		return squares;
	}

}
