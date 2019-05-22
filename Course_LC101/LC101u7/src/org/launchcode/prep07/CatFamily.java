package org.launchcode.prep07;

public class CatFamily {

	public static void main(String[] args) {
		//make a housecat named Garfield
		HouseCat garfield = new HouseCat("Garfield", 12);
		//Garfield eats something
		garfield.eat();
		//let Garfield tell us whether he's hungry, his name and his class
		System.out.println(garfield.isHungry() + " - " + garfield.noise() + " " + garfield.purr());
		
		//make a housecat named Meowthra
		HouseCat meowthra = new HouseCat("Meowthra", 11);
		//make Meowthra tired
		meowthra.setTired(true);
		//let Meowthra tell us whether she's tired, her name and class
		System.out.println(meowthra.isTired() + " - " + meowthra.noise() + " " + meowthra.purr());
	}
}