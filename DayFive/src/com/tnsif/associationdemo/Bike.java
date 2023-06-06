package com.tnsif.associationdemo;

public class Bike {
	
	private String color;
	private int topSpeed;
	
	//getter and setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	
	//method
	public void info()
	{
		System.out.println("Bike color "+color+" "+"Bike topSpeed "+topSpeed );
	}
	
	
	public static void main(String[] args) {
		
		Bike ktm =new Bike();
		
		ktm.color="Red";
		ktm.topSpeed=179;
		
		ktm.info();
		
		KTM ktm1=new KTM();
		ktm1.KTM_Demo();
		
	}
	
}

//child class

class KTM extends Bike
{
	
	public void KTM_Demo()
	{
		Engine KTM_engine=new Engine();
		KTM_engine.engine_on();
		KTM_engine.engine_off();
	}
	
}

class Engine 
{
	public void engine_on()
	{
	System.out.println("Iginition ON");	
	}
	
	public void engine_off()
	{
		System.out.println("Iginition Killed");	
	}
	
}
