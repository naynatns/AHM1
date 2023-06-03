package com.tnsif.constructordemo;


//Entity 
public class Customer {
	
	private String customerName;
	private int intId;
	private String customerCity;
	
	//Default COnstructor
	public Customer() {
		customerName = "Nayna";
		intId = 20;
		customerCity = "Mumbai";
	}

	
	//Parametrized Constructor
	public Customer(String customerName, int intId, String customerCity) {
		
		this.customerName = customerName;
		this.intId = intId;
		this.customerCity = customerCity;
	}

	//Getter & Setter 
	
	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getIntId() {
		return intId;
	}


	public void setIntId(int intId) {
		this.intId = intId;
	}


	public String getCustomerCity() {
		return customerCity;
	}


	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}


	
	//Object class-method -toString
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", intId=" + intId + ", customerCity=" + customerCity + "]";
	}
	
	
	
	
	
	

}
