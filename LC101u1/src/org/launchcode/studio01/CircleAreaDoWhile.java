package org.launchcode.studio01;

import java.util.Scanner;

public class CircleAreaDoWhile {
	public static void main(String args[]) {
		double circleRadius;
		double circleArea;
		
		Scanner circle = new Scanner(System.in);
		
		do {
			System.out.println("Enter the radius of the circle (must be positive): ");
			circleRadius = circle.nextDouble();
		}
		while (circleRadius < 0);
		
		circleArea = 3.14159 * (circleRadius * circleRadius);
		System.out.println("The area of the circle is: " + circleArea);
	}
}
