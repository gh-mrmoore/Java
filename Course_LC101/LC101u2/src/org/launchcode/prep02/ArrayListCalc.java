package org.launchcode.prep02;

import java.util.ArrayList;

public class ArrayListCalc {
	public static void main(String[] args) {
		ArrayList<Integer> intArray= new ArrayList<Integer>();
		intArray.add(5);
		intArray.add(7);
		intArray.add(9);
		intArray.add(11);
		intArray.add(13);
		intArray.add(2);
		intArray.add(4);
		intArray.add(6);
		intArray.add(8);
		intArray.add(10);
		
		for (Integer this_int : intArray) {
			System.out.println(this_int);
		}
		
		System.out.println("THe sum of the even numbers in the ArrayList is: " + calcEvens(intArray));
	}
	
	private static int calcEvens(ArrayList<Integer> integers) {
		// TODO Auto-generated method stub
		int evenSum = 0;
		for (int item : integers) {
			if (item % 2 == 0) {
				evenSum = evenSum + item;
			}
		}
		return evenSum;
	}
}
