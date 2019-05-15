package school;

public class Student {
	//create variable to allow class to set its own ID
	private static int nextStudentID = 1;
	
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
	
	//add ability to auto-generate studentID
	public Student(String name) {
		this(name, nextStudentID);
		nextStudentID++;
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