package com.tnsif.packagethree;

//Singleton class

public class MyClass {
	
	private int id;
	
	private static MyClass obj=new MyClass();
	
	
	private MyClass()
	{
		System.out.println("Private Constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//factory method
	public static MyClass getObject()
	{
		return obj;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
	
	

}
