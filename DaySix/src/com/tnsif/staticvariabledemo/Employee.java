package com.tnsif.staticvariabledemo;

public class Employee {
	
	//Declare instance variables
	private String name;
	private int id;
	
	//declare static variable
	static String companyName="TNS";

	
	//Constructor
	public Employee(String name, int id) {
	
		this.name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ",Company="+companyName+"]";
	}


	
	
	
	
	
	

}
