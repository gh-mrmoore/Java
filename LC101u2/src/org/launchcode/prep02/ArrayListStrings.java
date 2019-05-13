package org.launchcode.prep02;

import java.util.ArrayList;

public class ArrayListStrings {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("Test");
		words.add("Tenth");
		words.add("Solid");
		words.add("Rock");
		words.add("Example");
		words.add("Array");
		
		System.out.println(findFives(words));
	}
	
	private static String findFives(ArrayList<String> someWords) {
		String feedback = "";
		for (String word : someWords) {
			if (word.length() == 5) {
				feedback = feedback + word + ", ";
			}
		}
		return feedback;
	}

}
