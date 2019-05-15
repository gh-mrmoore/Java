package org.launchcode.prep05;

public class Temperature {
	private double fahrenheit;

    private static double absoluteZeroFahrenheit = -459.67;   //static fields are shared by all instances of the class
    //make absolute zero a constant:
    public static final double ABS_ZERO_F = -459.67;

    public double getFahrenheit() {return fahrenheit;}

    public void setFahrenheit(double aFahrenheit) {

        if (aFahrenheit < absoluteZeroFahrenheit) {
            throw new IllegalArgumentException("Value is below absolute zero");
        }

        fahrenheit = aFahrenheit;
    }
    
    public double getCelsius() {return (fahrenheit - 32) * 5.0 / 9.0;}

    public void setCelsius(double celsius) {
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        setFahrenheit(fahrenheit);
    }
}
