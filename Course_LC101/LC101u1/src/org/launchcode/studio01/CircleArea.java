package org.launchcode.studio01;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double circleRadius;
		double circleArea;
		Scanner in;
		
		in = new Scanner(System.in);
		System.out.println("What is the radius of the circle? ");
		circleRadius = in.nextDouble();
		
		if (circleRadius < 0) {
			System.out.println("Circle radius cannot be zero");
		} else {
			circleArea = 3.14159 * (circleRadius * circleRadius);
			System.out.println("The area of the circle is: " + circleArea);
		}
	}
}
