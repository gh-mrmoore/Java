package org.launchcode.prep02;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer, String> roster = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.print("Student Name: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Student ID: ");
                int newStudentID = in.nextInt();

                roster.put(newStudentID, newStudent);

                in.nextLine();
            }
        } while(!newStudent.equals(""));

        for (Entry<Integer, String> student : roster.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
	}
}