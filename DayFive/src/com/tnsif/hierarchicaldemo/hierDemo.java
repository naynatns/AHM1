package com.tnsif.hierarchicaldemo;

public class hierDemo {

	public static void main(String[] args) {
		Person p1=new Person();
		
		System.out.println(p1);
		
		Person p;
		p=new Person("Dhruvil","Mumbai",10);
		if(p instanceof Person)
			System.out.println("Person Details "+p);

		
		p=new Employee("Dhruv", "Pune", 23, 10, 5000, "IT");
		if(p instanceof Employee)
			System.out.println("Person Details "+p);
		
		p=new Student();
		if(p instanceof Student)
			System.out.println("Person Details "+p);
	}

}
