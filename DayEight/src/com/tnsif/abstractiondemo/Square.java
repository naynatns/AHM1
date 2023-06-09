package com.tnsif.abstractiondemo;

public class Square extends Shape{

	float side;
	
	public Square()
	{
		side=2.0f;
	}
	public Square(float side)
	{
		this.side=side;
	}
	
	
	@Override
	public void calArea() {
	area=side*side;
		
	}

}
