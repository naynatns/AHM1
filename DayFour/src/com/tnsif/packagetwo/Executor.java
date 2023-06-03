package com.tnsif.packagetwo;

import com.tnsif.packageone.*;

public class Executor extends Base {
	
	public  void call()
	{
		varProtected=23;
		methodProtected();
	
	}
	
	public static void main(String[] args) {
		
		Base b=new Base();
		
		b.methodPublic();
		b.methodCall();
	
		Executor e=new Executor();
		e.call();
		
		
		
		
		
		
	}

}
