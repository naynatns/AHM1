package com.tnsif.abstractiondemo;

public abstract class Shape {
	
	protected float area;
	public int side;
	
	//abstract method
	public abstract void calArea();
	
	
	//solid method
	void show()
	{
		System.out.println("Area of the shape is "+area);
	}
	
	
	

}
