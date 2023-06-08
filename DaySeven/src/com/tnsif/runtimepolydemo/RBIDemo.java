package com.tnsif.runtimepolydemo;

public class RBIDemo {

	public static void main(String[] args) {

		RBI rbi;
		
		//Dynamic Binding -loose coupling
		
				
		rbi=new SBI();
		System.out.println(rbi.getROI());
		
		rbi=new HDFC();
		System.out.println(rbi.getROI());
		
		rbi=new Axis();
		System.out.println(rbi.getROI());
		
		
	}

}
