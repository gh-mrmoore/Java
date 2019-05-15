package org.launchcode.prep01;

import java.util.Scanner;

public class Rectangle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create the new scanner object to receive user input
		Scanner rectangle = new Scanner(System.in);
		
		//Get the dimensions of the rectangle
		System.out.println("What is the length of the rectangle? ");
		double rectangleLength = rectangle.nextDouble();
		System.out.println("What is the width of the rectangle? ");
		double rectangleWidth = rectangle.nextDouble();
		
		//Calculate the area of the rectangle and print out the area
		double rectangleArea = rectangleLength * rectangleWidth;
		System.out.println("The area of the rectangle is: " + rectangleArea);
		

	}

}
