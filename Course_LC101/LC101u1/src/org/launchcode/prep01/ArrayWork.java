package org.launchcode.prep01;

import java.util.ArrayList;

public class ArrayWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> shoes = new ArrayList<String>();
		shoes.add("Jordan XXI");
		shoes.add("Air Max 180");
		shoes.add("LeBron V");
		
		System.out.println(shoes);
		
		for (String shoe : shoes) {
			System.out.println(shoe);
		}
		

	}

}
