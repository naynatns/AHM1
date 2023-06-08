//method overloading
package com.tnsif.compiletimepolydemo;

public class Maths {
	
	public int addition(int a,int b)
	{
		return a+b;
	}
	public float addition(int a,float b)
	{
		return a+b;
	}
	public int addition(int a,int b,int c)
	{
		return a+b+c;
	}
	public int addition(int a)
	{
		return a+a;
	}
	
	public float addition(float a,int b)
	{
		return a+b;
	}
	public String addition(String a,String b)
	{
		return a+b;
	}

}
