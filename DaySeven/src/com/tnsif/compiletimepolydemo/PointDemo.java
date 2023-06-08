package com.tnsif.compiletimepolydemo;

public class PointDemo {

	public static void main(String[] args) {
		
		Point p1=new Point();
		System.out.println(p1);
		
		Point p2=new Point(3.0f);
		System.out.println(p2);
		
		Point p3=new Point(2.1f,4.5f);
		System.out.println(p3);
		
		
		System.out.println("***************************");
		Maths m1=new Maths();
		
		System.out.println(m1.addition(12));
		System.out.println(m1.addition(4, 5.6f));
		System.out.println(m1.addition(12, 34, 23));
		System.out.println(m1.addition("Hello", "All"));
		
		
		

	}

}
