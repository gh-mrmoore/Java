package org.launchcode.prep07;

public abstract class Cat {
	private boolean tired = false;
	private boolean hungry = false;
	private double weight;
	
	private String family = "Felidae";
	
	//constructor(s) for Cat
	public Cat(double aWeight) {
		weight = aWeight;
	}
	
	//getter-setter pairs
	public boolean isTired() {return tired;}
    public void setTired(boolean aTired) {tired = aTired;}

    public boolean isHungry() {return hungry;}
    public void setHungry(boolean aHungry) {hungry = aHungry;}

    public double getWeight() {return weight;}
    public void setWeight(double aWeight) {weight = aWeight;}

    public String getFamily() {return family;}
    
    //instance methods
    // A cat is rested and hungry after it sleeps
    public void sleep() {
        tired = false;
        hungry = true;
    }

    // Eating makes a cat not hungry
    public void eat() {

        // eating when not hungry makes a cat sleepy
        if (!hungry) {
            tired = true;
        }

        hungry = false;
    }

    public String noise () {
        return "Meeeeeeooooowww!";
    }
}
