package org.launchcode.prep05;

public class HelloWorld {
	//add access modifier - better to be to strict than too open
	private String message = "Hello World";   //instance variable aka field
	
	void sayHello() {
		//add local variable to demonstrate difference when using 'this'
		String message = "Goodnight World";
		
		System.out.println(message);       //will print a local variable, if present
		System.out.println(this.message);  //alternative way to print instance variable aka field
	}
}