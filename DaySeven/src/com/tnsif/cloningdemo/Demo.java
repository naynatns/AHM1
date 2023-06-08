package com.tnsif.cloningdemo;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student(01, "BE", 100);
		s1.printData();
		
	
		
		//cloning object of student class
		//Student s2=(Student) s1.clone();  //class casting
		//s2.printData();
		
		Student s3=s1;
		s3.setClassName("FE");
		s3.setId(23);
		s3.printData();
	}

}
