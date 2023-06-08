package com.tnsif.compiletimepolydemo;

public class Point {

	private float x;
	private float y;

	// default constructor
	public Point() {
		x = 0.0f;
		y = 0.0f;

	}

	//Parameterized Constructor 
	public Point(float x) {
	
		this.x = x;
		this.y = x;
	}


	
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	
	//toString
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
