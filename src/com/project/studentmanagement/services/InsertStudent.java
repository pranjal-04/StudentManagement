package com.project.studentmanagement.services;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.project.studentmanagement.entity.Student;
import com.project.studentmanagement.repository.AddStudent;

public class InsertStudent implements AddStudent {

	public void addStudent(ArrayList<Student> students) {
		// Create scanner object for user input
		Scanner sc = new Scanner(System.in);
		long rollno;
		long contact;
		int age;
		try {
			System.out.print("\n	Enter the name of Student: ");
			String name = sc.nextLine();

			do {
				System.out.print("\n	Enter the Enrollment number of student: ");
				rollno = sc.nextLong();
				if (String.valueOf(rollno).length() != 12) {
					System.out.println("\n	Enrollment number must have exactly 12 digits.");
				}
			} while (String.valueOf(rollno).length() != 12);
			
			System.out.print("\n	Enter the college name of Student: ");
			sc.nextLine();
			String college = sc.nextLine();
			do {
				System.out.print("\n	Enter the age of student: ");
				age = sc.nextInt();
				if(age <= 0 || age >= 100) {
					System.out.println(" Please enter a valid age, Age must be positive number and less than 100: ");
				}
			} while (age <= 15 || age >= 100);
			
			System.out.print("\n	Enetr the Department name: ");
			String department = sc.next();
			System.out.print("\n	Enter the address of Student: ");
			sc.nextLine();
			String address = sc.nextLine();
			
			do {
				System.out.print("\n	Enter the contact no: ");
				contact = sc.nextLong();
				if (String.valueOf(contact).length() != 10) {
					System.out.println("\n	Contact number must have exactly 10 digits.");
				}
			} while (String.valueOf(contact).length() != 10);

			// Creating the student object using parameterized constructor
			Student student = new Student(name, rollno, college, address, contact, department, age);
			// Adding the student object to the ArrayList
			students.add(student);
			System.out.println("\nStudent added Successfully!");

		} catch (InputMismatchException e) {
			System.out.println("	Enter valid data! ");

		} catch (Exception e) {
			// Catch and print error message if any exception occurs
			System.out.println("Please enter the correct information!\n\n");
		}

	}
}
