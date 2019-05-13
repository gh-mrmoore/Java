package org.launchcode.prep01;

import java.util.Scanner;

public class FindAlice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String alice = "Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or twice " +
                "she had peeped into the book her sister was reading, but it had " +
                "no pictures or conversations in it, 'and what is the use of a " +
                "book,' thought Alice 'without pictures or conversation?'";

        //get the string that the user wishes to find
        Scanner findAlice = new Scanner(System.in);
        System.out.println("What string would you like to find?");
        String userSearch = findAlice.nextLine();

        System.out.println("Found? " + alice.contains(userSearch));

	}

}
