package org.launchcode.studio02;

import java.util.HashMap;
import java.util.Map;

public class CountingCharactersBonus02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque " +
                "sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit " +
                "amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat " +
                "eget massa. Donec nec velit non ligula efficitur luctus.";
        
        //only count characters as lower-case values
        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> myCounter = new HashMap<>();

        //get each character in the string being examined
        for (char item : charactersInString) {
            Character lowerChar = Character.toLowerCase(item);
            //see if the character is in an actual letter
            if (Character.isLetter(lowerChar)) {
	            if (myCounter.containsKey(lowerChar)) {
	                int current_count = myCounter.get(lowerChar);
	                int new_count = current_count + 1;
	                myCounter.put(lowerChar, new_count);
	            } else {
	                int starting_count = 1;
	                myCounter.put(lowerChar, starting_count);
	            }
            }
        }

        for (Map.Entry<Character, Integer> thisChar : myCounter.entrySet()) {
            System.out.println(thisChar.getKey() + ": " + thisChar.getValue());
        }
	}
}