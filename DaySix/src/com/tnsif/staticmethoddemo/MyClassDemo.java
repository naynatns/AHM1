package com.tnsif.staticmethoddemo;

public class MyClassDemo {

	public static void main(String[] args) {
		
		
		MyClass.show(); // calling static method using class name without creating object

		MyClass obj = new MyClass();

		System.out.println(obj);
		//obj.disp();
		
		MyClass obj1 = new MyClass();

		System.out.println(obj1);

	}

}
