//to demonstrate ternary,arithmetic,pre/post increment/decrement

package com.tnsif.daytwo;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int x=13;
		
		System.out.println("value of a and b before opearations" +a+" "+b);
		
		++a; //pre increment --11
		
		int c =++a+b+a--;  //c=12+20+12=44
		
		System.out.println("c value after the opearion: "+c);
		
		int d=c++ +a+b--;  //d=44+11+20=75
		
		System.out.println(d);
		
		//ternary operator demonstration
		x=(13==x)? 1:0;
		System.out.println(x);
		
	}

}
