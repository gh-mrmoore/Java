package org.launchcode.prep01;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputObject = new Scanner(System.in);
		System.out.println("What is your name?");
		
		String userName = inputObject.nextLine();
		System.out.println("Welcome " + userName);

	}

}
