package com.tnsif.hierarchicaldemo;

public class Employee extends Person{


	private int empId;
	private float slary;
	private String dept;
	
	
	public Employee(String name, String city, int age) {
		System.out.println("Empty Constructor");
	}
	
	
	public Employee(String name, String city, int age, int empId, float slary, String dept) {
		super(name, city, age);
		this.empId = empId;
		this.slary = slary;
		this.dept = dept;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public float getSlary() {
		return slary;
	}


	public void setSlary(float slary) {
		this.slary = slary;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", slary=" + slary + ", dept=" + dept + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + ", getAge()=" + getAge() + "]";
	}

	
	

}
