package com.tnsif.finaldemo;

public class FinalVariable {
	
	
	//declare variable
//   final int x;  //initialization is required
	
	final int x=100;
	
	static int y=10;;
	
	final static int z=10;
	
	void change()
	{
		//x=25; //final variables can't be reassigned
		//y=56;  //final variables can't be reassigned
		System.out.println(x+" "+y);
	}

	
	static 
	{
		y=45;
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + "y=" + y +"z=" + z +"]";
	}
	
	public static void main(String[] args) {
		FinalVariable f=new FinalVariable();
		f.change();
	}
	
}
