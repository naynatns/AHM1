package com.tnsif.staticmethoddemo;

public class MyClass {

	private int section;
	private static int srNo;

	// static block
	static {
		System.out.println("Inside static block");
		srNo = 1000;
		// section=10;
	}
	static {
		System.out.println("Inside static block");
		srNo = 2000;
		// section=10;
	}

	// default constructor

	public MyClass() {
		srNo++;  //srNo=1001; 1002
		section++; //Section=1; 1
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section +" "+"serialNo="+srNo+"]";
	}
	
	
	//static method
	static void show()
	{
		//System.out.println(section);  //non static variables are not accepted
		System.out.println(srNo);
	}
	//non-static method
	public void disp()
	{
		System.out.println(section);
		System.out.println(srNo);
	}
	
	
	

}
