package org.launchcode.studio01;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) {
        String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque " +
                "sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit " +
                "amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat " +
                "eget massa. Donec nec velit non ligula efficitur luctus.";

        char[] charactersInString = myString.toCharArray();
        int i = 0;
        int char_counter = 0;
        int mock_count = 1;
        int int_ms = charactersInString.length;
        Character mySearch = 'r';
        HashMap<Character, Integer> myCounter = new HashMap<>();

        for (Character item : charactersInString) {
            if (myCounter.containsKey(item)) {
                //System.out.println("Found it!");
                int current_count = myCounter.get(item);
                int new_count = current_count + 1;
                myCounter.put(item, new_count);
            } else {
                //System.out.println("Did not find it!");
                int starting_count = 1;
                myCounter.put(item, starting_count);
                }
        }

        for (Map.Entry<Character, Integer> thisChar : myCounter.entrySet()) {
            System.out.println(thisChar.getKey() + ": " + thisChar.getValue());
        }
    }
}
