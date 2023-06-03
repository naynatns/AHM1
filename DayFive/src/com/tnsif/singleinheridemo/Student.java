package com.tnsif.singleinheridemo;

public class Student extends Citizen{
	
	//Data members
	private int rollNo;
	private String collegeName;
	
	/*
	 * //Default Constructor public Student() { super(); //calling default
	 * constructor of parent class }
	 */
	
	//Parametrized Constructor
	public Student(String name, String aadharNo, String address, long phNo, int rollNo, String collegeName) {
		super(name, aadharNo, address, phNo);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAadharNo()=" + getAadharNo() + ", getAddress()=" + getAddress() + ", getPhNo()=" + getPhNo()
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
