package org.launchcode.studio01;

import java.util.HashMap;
import java.util.Map;
import java.lang.*;

public class CharacterCounterRefined {
    public static void main(String[] args) {
        String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque " +
                "sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit " +
                "amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat " +
                "eget massa. Donec nec velit non ligula efficitur luctus.";

        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> myCounter = new HashMap<>();

        for (char item : charactersInString) {
            Character lowerChar = Character.toLowerCase(item);
            if (myCounter.containsKey(lowerChar)) {
                int current_count = myCounter.get(lowerChar);
                int new_count = current_count + 1;
                myCounter.put(lowerChar, new_count);
            } else {
                int starting_count = 1;
                myCounter.put(lowerChar, starting_count);
            }
        }

        for (Map.Entry<Character, Integer> thisChar : myCounter.entrySet()) {
            System.out.println(thisChar.getKey() + ": " + thisChar.getValue());
        }
    }
}