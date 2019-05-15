package org.launchcode.prep01;

public class HelloHelper {
	private static final String MESSAGE = "Hello World!";
	
	private String message = "";
	
	public HelloHelper(String message) {
		this.message = message;
	}
	
	public void saySomething() {
		System.out.println(message);
	}
	
	//getter-setter pair for message
	public String getMessage() {return message;}
	public void setMessage(String message) {this.message = message;}

}
