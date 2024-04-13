package com.project.studentmanagement.services;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.project.studentmanagement.entity.*;
import com.project.studentmanagement.repository.UpdateStudent;

class MyException extends Exception{
	
	public MyException(String s) {
		super(s);
	}
}
public class UpdateDetails implements UpdateStudent{

	public void updateStudent(ArrayList<Student> students) {

		Scanner scanner = new Scanner(System.in);
        int age;
		// Check if the student list is empty
		if (students.isEmpty()) {
			System.out.println("\n Student record is empty!!\n");
			return;
		}
		else {
			try {
				// Taking the enrollment ID as a unique key to update student record
				System.out.print("   Enter the Enrollment ID to update student record: ");
				long rollno = scanner.nextLong();

				// Check if the enrollment ID is valid
				if (rollno <= 0) {
					throw new MyException("  Invalid input: Enrollment number must be a positive integer.");
				}

				int ch;
	            boolean found = false; // for tracking the Enrollment ID is present or not
				//Traverse the student list
				for (Student student : students) {
					if (student.getErollNo() == rollno) {
						// Display menu for updating student details
						System.out.println("\n");
						System.out.println("  -|-------------- MENU ----------------|-");
						System.out.println("   |                                    |");
						System.out.println("   |    1. Update name.                 |");
						System.out.println("   |    2. Update College Name.         |");
						System.out.println("   |    3. Update Address.              | ");
						System.out.println("   |    4. Update Contact Number.       |");
						System.out.println("   |    5. Update Department Name       |");
						System.out.println("   |    6. Update Age of student        | ");
						System.out.println("   |                                    |");
						System.out.println("  -|------------------------------------|-");
						System.out.print("\n	Enter your choice (1-6): ");
						
	                    // Read user choice
						ch = scanner.nextInt();
						switch (ch) {

						case 1:
							System.out.print("\n   Enter the updated name of Student: ");
							scanner.nextLine();
							String name = scanner.nextLine();
							student.setStudentName(name);
							break;
						case 2:
							System.out.print("\n	Enter the updated college name of Student: ");
							scanner.nextLine();
							String college = scanner.nextLine();
							student.setCollegeName(college);
							break;
						case 3:
							System.out.print("\n	Enter the updated address of Student: ");
							scanner.nextLine();
							String address = scanner.nextLine();
							student.setAddress(address);
							break;
						case 4:
							System.out.print("\n	Enter the updated contact no: ");
							long contact = scanner.nextLong();
							student.setContactNo(contact);
							break;
						case 5:
							System.out.print("\n	Enetr the updated Department name: ");
							scanner.nextLine();
							String department = scanner.next();
							student.setDepartment(department);
							break;
						case 6:
							do {

								System.out.print("\n	Enter the age of student: ");
								age = scanner.nextInt();
								if(age <= 0 || age >= 100) {
									System.out.println(" Please enter a valid age, Age must be positive number and less than 100: ");
								}
							} while (age <= 15 || age >= 100);
							break;
						default:
							System.out.println("\n	Please enter valid number");
							break;
						}

						System.out.println("\n	Details updated Successfully!\n");
						found=true;
					} 
				}
				if(found == false) {
					System.out.println("\n	Enrollment ID is not found\n");
				}

			} catch (MyException e) {
	            // Catch and print exception message when the entered enrollment id is not valid
				System.out.println(e.getMessage());
			}catch(InputMismatchException e) {
				System.out.println("	Enter valid data! ");
				
			}catch(Exception e) {
				System.out.println("  Something went wrong! ");
			}
		}
		
	}
}
