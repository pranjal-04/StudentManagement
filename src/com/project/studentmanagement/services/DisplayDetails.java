package com.project.studentmanagement.services;

import java.util.ArrayList;

import com.project.studentmanagement.entity.Student;
import com.project.studentmanagement.repository.DisplayDetail;

public class DisplayDetails implements DisplayDetail {

	public void displayDetail(ArrayList<Student> students) {
		
		// Check if the student list is empty
		if(students.isEmpty()) {
			System.out.println("\n	Student record is empty!!");
			return;
		}
		System.out.println("\n********** All student details ***************");
		
		// Loop through each student and display their details
		for(Student student: students) {
			System.out.print("\n  Name-"+student.getStudentName());
			System.out.print("  Roll No-"+student.getErollNo());
			System.out.print("  College-"+student.getCollegeName());
			System.out.print("  Age-"+student.getAge());
			System.out.print("  Address-"+student.getAddress());
			System.out.print("  Phone no-"+student.getContactNo());
			System.out.print("  Department-"+student.getDepartment());
		}
	}
}
