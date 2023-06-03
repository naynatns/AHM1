package com.tnsif.packageone;

public class Base {
	
	
	//Data members
	int varDefault=10;
	public int varPublic=20;
	protected int varProtected=30;
	private int varPrivate=40;
	
	
	void methodDefault()
	{
		System.out.println("Default Method");
		System.out.println("Default variable value: "+varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("Public Method");
		System.out.println("Public variable value: "+varPublic);
	}
	
	
	
	protected void methodProtected()
	{
		System.out.println("Protected Method");
		System.out.println("Protected variable value: "+varProtected);
	}
	
	public void methodCall()
	{
		varProtected=67;
		methodProtected();
		
				
	}
	private void methodPrivate()
	{
		System.out.println("Private Method");
		System.out.println("Private variable value: "+varPrivate);
		
		
	}
	


}
