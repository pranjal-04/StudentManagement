package com.project.studentmanagement.entity;

//Class representing a student entity
public class Student {

	// Data members
	private String studentName;
	private long erollNo; // Enrollment number (unique id)
	private String collegeName;
	private String address;
	private long contactNo;
	private String department;
	private int age;
	
	// Default constructor
	public Student() {
		this.studentName = null;
		this.erollNo = 0;
		this.collegeName = null;
		this.address = null;
		this.contactNo = 0;
		this.department = null;
		this.age = 0;
	}

	// Parameterized constructor
	public Student(String studentName, long erollNo, String collegeName, String address, long contactNo,
			String department, int age) {

		this.studentName = studentName;
		this.erollNo = erollNo;
		this.collegeName = collegeName;
		this.address = address;
		this.contactNo = contactNo;
		this.department = department;
		this.age = age;
	}

	// Getters and setters for data members
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getErollNo() {
		return erollNo;
	}

	public void setErollNo(long erollNo) {
		this.erollNo = erollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
