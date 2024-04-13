package com.project.studentmanagement.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.studentmanagement.entity.Student;

public class SearchStudent {
	// method overloading
	// method for searching student record with the help of enrollment id
	public void searchStudent(ArrayList<Student> students, long rollno) {
		Scanner scanner = new Scanner(System.in);

		// Check if the student list is empty
		if (students.isEmpty()) {
			System.out.println("Student record is empty!!\n");
			return;
		} else {
			boolean found = false;
			// Traverse the student list
			for (Student student : students) {
				if (student.getErollNo() == rollno) {
					// Display menu for search student details
					System.out.println("\n  \t Name: " + student.getStudentName());
					System.out.println("  \t Enrollment Number: " + student.getErollNo());
					System.out.println("  \t College Name: " + student.getCollegeName());
					System.out.println("  \t Age: " + student.getAge());
					System.out.println("  \t Address: " + student.getAddress());
					System.out.println("  \t Contact No: " + student.getContactNo());
					System.out.println("  \t Department: " + student.getDepartment());
					found = true;
				}
			}
			if (found == false) {
				System.out.println("   Enrollment id is not found!");
			}

		}
	}

	// method for searching student by using the name
	public void searchStudent(ArrayList<Student> students, String name) {

		// Check if the student list is empty
		if (students.isEmpty()) {
			System.out.println("Student record is empty!!\n");
			return;
		} else {
			boolean found = false;
			// Traverse the student list
			for (Student student : students) {

				if (student.getStudentName().equals(name)) {
					// Display menu for search student details
					System.out.println("\n  \t Name: " + student.getStudentName());
					System.out.println("  \t Enrollment Number: " + student.getErollNo());
					System.out.println("  \t College Name: " + student.getCollegeName());
					System.out.println("  \t Age: " + student.getAge());
					System.out.println("  \t Address: " + student.getAddress());
					System.out.println("  \t Contact No: " + student.getContactNo());
					System.out.println("  \t Department: " + student.getDepartment());
					found = true;
				}
			}
			if (found == false) {
				System.out.println("   Name is not found!");
			}

		}
	}
}
