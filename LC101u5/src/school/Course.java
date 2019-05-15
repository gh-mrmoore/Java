package school;

import java.util.ArrayList;

public class Course {
	String courseName;
	int courseID;   //would probably be a string in real-life (BIO101, etc), but using int here
	int credits;
	ArrayList<Student> enrollment;
	
	//getter-setter pairs
	public String getCourseName() {return courseName;}
	public void setCourseName(String courseName) {this.courseName = courseName;}
	
	public int getCourseID() {return courseID;}
	public void setCourseID(int courseID) {this.courseID = courseID;}
	
	public int getCredits() {return credits;}
	public void setCredits(int credits) {this.credits = credits;}
	
	public ArrayList<Student> getEnrollment() {return enrollment;}
	public void setEnrollment(ArrayList<Student> enrollment) {this.enrollment = enrollment;}
	

}
