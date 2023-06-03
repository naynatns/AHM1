package com.tnsif.packagethree;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass m=MyClass.getObject();
		
		m.setId(12);
		System.out.println(m);
		
		MyClass m1=MyClass.getObject();
		m1.setId(30);
		
		
		MyClass m2=MyClass.getObject();
		m2.setId(40);
		
		
		System.out.println(m);
		System.out.println(m1);
		System.out.println(m2);
		
		
		

	}

}
