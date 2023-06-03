package com.tnsif.constructordemo;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {

		// Run time

		Scanner sc = new Scanner(System.in);
		String name, city;
		int id;

		System.out.println("Enter Customer id");
		id = sc.nextInt();

		System.out.println("Enter Customer name");
		name = sc.next();

		System.out.println("Enter Customer city");
		city = sc.next();

		Customer c2 = new Customer(name, id, city);
		c2.setCustomerName(name);
		c2.setIntId(id);
		c2.setCustomerCity(city);
		System.out.println(c2);

		// compile time
		Customer c = new Customer();
		System.out.println(c);

		Customer c1 = new Customer(); // Default Constructor
		c1.setCustomerName("Bhavya");
		c1.setIntId(1);
		c1.setCustomerCity("Ahmedabad");
		System.out.println(c1);

	}

}
