package com.tnsif.abstractiondemo;

public class Rectangle extends Shape {
	float width, height;

	public Rectangle() {
		width = 3.0f;
		height = 2.0f;
	}

	public Rectangle(float width, float height) {
		
		this.width = width;
		this.height = height;
	}

	@Override
	public void calArea() {
		area=width*height;
		
	}

}
