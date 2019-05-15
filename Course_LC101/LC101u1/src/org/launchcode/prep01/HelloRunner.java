package org.launchcode.prep01;

public class HelloRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Printing a message directly to the prompt from here");
		HelloHelper goodbye = new HelloHelper("Printing a message to the prompt using a different class");
		goodbye.saySomething();

	}

}
