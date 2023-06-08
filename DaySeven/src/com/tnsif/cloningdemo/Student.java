package com.tnsif.cloningdemo;

public class Student implements Cloneable{
	
	int rollNo;
	String className;
	int id;
	
	//getter & Setter
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//Parameterized Constructor
	public Student(int rollNo, String className, int id) {
		
		this.rollNo = rollNo;
		this.className = className;
		this.id = id;
	}
	
	//print method
	public void printData()
	{
		System.out.println("Roll No: "+rollNo+" "+"Class Name: "+className+" "+"id: "+id);
	}
	
	/*
	 * //Object class-clone method
	 * 
	 * @Override public Object clone() throws CloneNotSupportedException { return
	 * super.clone();
	 * 
	 */
	
	//Object class-clone method
		@Override
		public Student clone() throws CloneNotSupportedException
		{
			return (Student)super.clone();
			
		}
	
	

}
