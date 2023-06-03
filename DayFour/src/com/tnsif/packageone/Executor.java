package com.tnsif.packageone;

public class Executor {

	public static void main(String[] args) {
		
		Base b=new Base();
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		System.out.println("******************************");
		b.varDefault=11;
		b.varProtected=22;
		b.varPublic=33;
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		
		
		Person p=new Person();
		System.out.println(p instanceof Person);
		//System.out.println(p instanceof Base);  //CTE
	}
	
	
}
