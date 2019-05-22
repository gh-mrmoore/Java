package org.launchcode.prep06.school;

import java.util.ArrayList;

public class Course {
	private static int nextCourseID = 1;
	
	String courseName;
	int courseID;   //would probably be a string in real-life (BIO101, etc), but using int here
	int courseCredits;
	double courseGrade;
	ArrayList<Student> enrollment;
	
	//constructor(s) for Course
	public Course(String courseName, int courseCredits, ArrayList<Student> enrollment) {
		this.courseName = courseName;
		this.courseCredits = courseCredits;
		this.enrollment = enrollment;
		this.courseID = nextCourseID;
		nextCourseID++;
	}
	
	//getter-setter pairs
	public String getCourseName() {return courseName;}
	public void setCourseName(String courseName) {this.courseName = courseName;}
	
	public int getCourseID() {return courseID;}
	public void setCourseID(int courseID) {this.courseID = courseID;}
	
	public int getCourseCredits() {return courseCredits;}
	public void setCourseCredits(int courseCredits) {this.courseCredits = courseCredits;}

	public double getCourseGrade() {return courseGrade;}
	public void setCourseGrade(double courseGrade) {this.courseGrade = courseGrade;}

	public ArrayList<Student> getEnrollment() {return enrollment;}
	public void setEnrollment(ArrayList<Student> enrollment) {this.enrollment = enrollment;}
}