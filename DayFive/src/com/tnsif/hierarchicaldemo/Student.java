package com.tnsif.hierarchicaldemo;

public class Student extends Person {
	
	private float per;
	private int rollNo;
	private String year;
	
	
	public Student() {
		per=87;
		rollNo=34;
		year="FY";
	}


	public Student(float per, int rollNo, String year) {
		super();
		this.per = per;
		this.rollNo = rollNo;
		this.year = year;
	}


	public float getPer() {
		return per;
	}


	public void setPer(float per) {
		this.per = per;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "Student [per=" + per + ", rollNo=" + rollNo + ", year=" + year + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + ", getAge()=" + getAge() + "]";
	}
	
	

}
