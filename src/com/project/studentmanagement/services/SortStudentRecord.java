package com.project.studentmanagement.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.project.studentmanagement.entity.Student;

public class SortStudentRecord {

	public void sortStudentRecord(ArrayList<Student> students) {

		// check the student record is empty or not
		if (students.isEmpty()) {
			System.out.println("Student Record id Empty!!");
			return;
		} else {
			// creating the object of scanner class
			Scanner scanner = new Scanner(System.in);
			// creating new array list object
			ArrayList<Student> copystudentdetails = new ArrayList<>();
			// copying the student details in copystudentdetails
			copystudentdetails.addAll(students);

			System.out.println("\n  ------ Menu ------");
			System.out.println("  1. Sort by Name");
			System.out.println("  2. Sort by enrollment number");
			System.out.println("  3. Sort by age");
			System.out.println(" ------------------");
			System.out.println("\n  Enter your choice: ");
			int ch = scanner.nextInt();

			// Comparator for sorting based on user's choice
			Comparator<Student> studentComparator = null;
			switch (ch) {
			case 1:
				studentComparator = Comparator.comparing(Student::getStudentName);
				break;
			case 2:
				studentComparator = Comparator.comparing(Student::getErollNo);
				break;
			case 3:
				studentComparator = Comparator.comparing(Student::getAge);
				break;
			default:
				System.out.println("  Enter a number (1-3)");
				break;
			}

			// Sort the student records
			Collections.sort(copystudentdetails, studentComparator);

			for (Student student : copystudentdetails) {
				System.out.print("\n   Name: " + student.getStudentName());
				System.out.print("   Enrollment Number: " + student.getErollNo());
				System.out.print("   College : " + student.getCollegeName());
				System.out.print("   Address: " + student.getAddress());
				System.out.print("   Age: " + student.getAge());
				System.out.print("   Contact No: " + student.getContactNo());
				System.out.print("   Department: " + student.getDepartment());
			}
		}

	}

}
