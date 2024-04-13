package com.project.studentmanagement.services;

import com.project.studentmanagement.repository.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import com.project.studentmanagement.entity.*;

public class DeleteStudent implements RemoveStudent {

	public void removeStudent(ArrayList<Student> students) {
		// Create a Scanner object to take input
		Scanner scanner = new Scanner(System.in);

		try {
			// Taking the enrollment ID as a unique key to delete a student record
			System.out.println("Enter the enrollment id to remove addmition");
			long rollno = scanner.nextLong();
			boolean found = false;
			// Iterator to traverse the ArrayList of students
			Iterator<Student> itr = students.iterator();
			while (itr.hasNext()) {
				// Retrieve the next student from the iterator
				Student student = itr.next();
				// Check if the enrollment ID matches
				if (student.getErollNo() == rollno) {
					itr.remove();
					System.out.println("Student record deleted successfully!");
					found = true;
					break; // Exit the loop since the record is found and deleted
				}
			}
			if (found == false) {
				System.out.println("Enrollment id is not found!");
			}
		} catch (InputMismatchException e) {
			System.out.println("Enrollment id must be a number ");
		} catch (Exception e) {
			System.out.println("Something went wrong!");
		}

	}
}
