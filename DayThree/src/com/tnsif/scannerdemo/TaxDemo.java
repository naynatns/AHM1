package com.tnsif.scannerdemo;


import java.util.*;
public class TaxDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name");
		String name=sc.nextLine();
		
		System.out.println("Enter gender");
		String gender=sc.nextLine();
		
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		System.out.println("Enter income");
		int income=sc.nextInt();
		
		Person jay=new Person();
		jay.setName(name);
		jay.setAge(age);
		jay.setGender(gender);
		jay.setIncome(income);
		System.out.println(jay);
		
		TaxCalculation tax=new TaxCalculation();
		tax.calculateTax(jay);
		System.out.println(jay);
		
		
		
	}

}
