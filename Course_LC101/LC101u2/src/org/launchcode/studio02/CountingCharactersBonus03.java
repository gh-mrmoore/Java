package org.launchcode.studio02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharactersBonus03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque " +
                "sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit " +
                "amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat " +
                "eget massa. Donec nec velit non ligula efficitur luctus.";
        
        //convert the string to a list of characters
        char[] charactersInString = myString.toCharArray();
        
        //create the counter hashmap
        HashMap<Character, Integer> myCounter = new HashMap<>();

        //get input from the user at the command line and then check the string for that input
        //assuming that the user will input a single alphabetic character
        Scanner userInput = new Scanner(System.in);
        System.out.println("What character are you looking for?");
        String userSearch = userInput.nextLine();
        char[] searchCharacter = userSearch.toCharArray();
        
        if (myString.contains(userSearch)) {
        	System.out.println("Found!");
        	for (char item : charactersInString) {
        		if (item == searchCharacter[0]) {
        			if (myCounter.containsKey(item)) {
        				int current_count = myCounter.get(item);
        				int new_count = current_count + 1;
        				myCounter.put(item, new_count);        				
        			} else {
        				int starting_count = 1;
        				myCounter.put(item,  starting_count);
        			}
        		}
        	}
        } else {
        	System.out.println("Not found!");
        }
        
        
        for (Map.Entry<Character, Integer> thisChar : myCounter.entrySet()) {
            System.out.println(thisChar.getKey() + ": " + thisChar.getValue());
        }
	}
}
