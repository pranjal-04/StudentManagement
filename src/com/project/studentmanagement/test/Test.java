package com.project.studentmanagement.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.studentmanagement.entity.Student;
import com.project.studentmanagement.services.DeleteStudent;
import com.project.studentmanagement.services.DisplayDetails;
import com.project.studentmanagement.services.InsertStudent;
import com.project.studentmanagement.services.SearchStudent;
import com.project.studentmanagement.services.SortStudentRecord;
import com.project.studentmanagement.services.UpdateDetails;

public class Test {

	public static void main(String[] args) {

		System.out.println("\n\n****** Welcome to Student Record Management System*******");
		
		// scanner class object for taking input
		Scanner scanner = new Scanner(System.in);

		// Creating ArrayList to store student objects
		ArrayList<Student> student = new ArrayList<>();

		int ch;

		while (true) {
			System.out.print("\n\n");
			System.out.println("  -|-------------- MENU ----------------|-");
			System.out.println("   |                                    |");
			System.out.println("   |    1. Add new student record.      |");
			System.out.println("   |    2. Update student record.       |");
			System.out.println("   |    3. Delete student recoed.       | ");
			System.out.println("   |    4. Search student record.       |");
			System.out.println("   |    5. Sort student record          |");
			System.out.println("   |    6. Display All student record.  | ");
			System.out.println("   |    7. Exit.                        | ");
			System.out.println("   |                                    |");
			System.out.println("  -|------------------------------------|-");
			System.out.print("\n	 Enter your choice (1-7): ");
			ch = scanner.nextInt();

			// Switch case to perform actions based on user choice
			switch (ch) {
			
 
			case 1:
				// Adding new student
				InsertStudent insertstudent = new InsertStudent();
				insertstudent.addStudent(student);
				break;
			case 2:
				// Updating student record
				UpdateDetails update = new UpdateDetails();
				update.updateStudent(student);
				break;
			case 3:
				// Deleting student record
				DeleteStudent deleteStudent = new DeleteStudent();
				deleteStudent.removeStudent(student);
				break;
			case 4:
				//Search particular student
				System.out.println("   1. Search by Enrollment ID ");
				System.out.println("   2. Search by name ");
				System.out.println("\n   Enter your choice: ");
				int ch2 = scanner.nextInt();
				//creating object of SearchStudent class
				SearchStudent searchStudent=new SearchStudent();
				
				switch(ch2) {
				case 1:
					// Taking the enrollment to search the student
					System.out.print("\n   Enter the enrollment id to search student- ");
					long rollno = scanner.nextLong();
					searchStudent.searchStudent(student, rollno);
					break;
				case 2:
					// Taking the name to search the student
					System.out.print("\n   Enter the student name to search student- ");
					String student_name = scanner.nextLine();
					student_name = scanner.nextLine();
					searchStudent.searchStudent(student, student_name);
					break;
					default:
						System.out.print("\n   Enter 1 or 2 ");
						break;
				}				
				break;
			case 5:
				//sort student record
				SortStudentRecord sortRecord = new SortStudentRecord();
				sortRecord.sortStudentRecord(student);
				break;
			case 6:
				// Displaying all student details
				DisplayDetails displayDetails = new DisplayDetails();
				displayDetails.displayDetail(student);
				break;
			case 7:
				// Exiting the program
				System.out.println("\n Exiting...");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter (1-6)");
				break;
			}
		}

	}

}
