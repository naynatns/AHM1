package com.tnsif.encapsulationdemo;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		
		//Object Creation
		Person p=new Person();  //heap
		
		p.setId(10);
		p.setName("Dipak");
		p.setAge(21);
		
		System.out.println(p);
		
	Person p1=new Person();  //heap
		
		p1.setId(11);
		p1.setName("Keyuri");
		p1.setAge(22);
		
		System.out.println(p1);

	}

}
