package com.tnsif.interfacedemo;

public interface Bank {
	
	static final float MINBAL=5000;
	static final float Deposit_limit=50000;
	public void deposit(float amount);
	public void withdraw(float amount);
	
}
