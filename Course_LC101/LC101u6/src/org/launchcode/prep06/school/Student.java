package org.launchcode.prep06.school;

public class Student {
	//set fields for each instance of the class - every object will have these fields
	private static int nextStudentID = 1;   //create variable to allow class to set its own ID
	
	String name;
	int studentID;
	int numberOfCredits;
	double gpa;
	
	//constructor(s) for Student
	public Student(String name, int studentID, int numberOfCredits, double gpa) {
		this.name = name;
		this.studentID = studentID;
		this.numberOfCredits = numberOfCredits;
		this.gpa = gpa;
	}
	
	public Student(String name, int studentID) {
		/*
		this.name = name;
		this.studentID = studentID;
		this.numberOfCredits = 0;
		this.gpa = 0.0;
		*/
		//re-written for brevity and simplicity
		this(name, studentID, 0, 0);
	}
	
	public Student(String name) {
		//add ability to auto-generate studentID
		this(name, nextStudentID);
		nextStudentID++;
	}
	
	//instance methods
	public void addGrade(int courseCredits, double courseGrade) {
		//update the number of credits and the GPA
		
		//get the current quality score (QS)
		double currentQS = getNumberOfCredits() * getGpa();
		
		//change the number of credits
		int currentCredits = getNumberOfCredits();
		int newCredits = currentCredits + courseCredits;
		//re-set the number of course credits
		Student.setNumberOfCredits(newCredits);
		
		//add the current QS to the QS from the new class
		double newQS = currentQS + (courseCredits * courseGrade);
		
		//calculate the new GPA
		double newGPA = newQS / newCredits;
		
		//update the student GPA
		.setGpa(newGPA);
	}
	
	public String getGradeLevel() {
		//calculate grade level based on the number of credits
		//freshman (0-29 credits), sophomore (30-59 credits), junior (60-89 credits), or senior (90+ credits
		int studentCredits = getNumberOfCredits();
		
		if (studentCredits <= 29) {
			return "Freshman";
		} else if (30 <= studentCredits  && studentCredits <= 59) {
			return "Sophomore";
		} else if (60 <= studentCredits && studentCredits <= 89) {
			return "Junior";
		} else {
			return "Senior";
		}
	}
	
	//special methods
	public String toString() {
		return "Name: " + name + " ID: " + studentID;
	}
	
	public boolean equals(Object o) {
		
		//see if the objects being compared are the same object
		if(o == this) {
			return true;
		}
		
		//check if o is null
		if (o == null) {
			return false;
		}
		
		//make sure that o was created by the Student class
		if (o.getClass() != getClass()) {
			return false;
		}
		
		//compare the student ID numbers for sameness
		Student theStudent = (Student) o;
		return theStudent.getStudentID() == getStudentID();
	}
	
	//getter-setter pairs
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public int getStudentID() {return studentID;}
	private void setStudentID(int studentID) {this.studentID = studentID;}
	//changed setter above to private from public since it'll be preferable to auto-generate to avoid duplicates
	
	public int getNumberOfCredits() {return numberOfCredits;}
	public void setNumberOfCredits(int numberOfCredits) {this.numberOfCredits = numberOfCredits;}
	
	public double getGpa() {return gpa;}
	private void setGpa(double gpa) {this.gpa = gpa;}
	//changed setter above to private from public as it'll be preferable to calculate rather than rely on user input
}