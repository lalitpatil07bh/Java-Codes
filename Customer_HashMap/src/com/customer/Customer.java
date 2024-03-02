package com.customer;

import java.time.LocalDate;

public class Customer {
	
	private  int customerID;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private double registration_amount;
	private LocalDate dob;
	private ServicePlan plan;
	private static int id_generator;
	private LocalDate lastPaidDate;
		
	// overloaded ctor to wrap PK (UID email)
//	public Customer(String email) {
//		super();
//		this.email = email;
//	}



	public LocalDate getLastPaidDate() {
		return lastPaidDate;
	}



	public void setLastPaidDate(String lastPaidDate) {
		this.lastPaidDate = LocalDate.now();
	}



	public Customer(String firstname, String lastname, String email, String password, double registration_amount,
			LocalDate dob, ServicePlan plan) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.registration_amount = registration_amount;
		this.dob = dob;
		this.plan =plan;
		this.customerID=++id_generator;
	}



	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", password="
				+ password + ", registration_amount=" + registration_amount + ", dob=" + dob + ", plan=" + plan + "]";
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
//	public boolean equals(Object o)
//	{
//		System.out.println("Inside the equals method");
//		if(o instanceof Customer)
//		{
//			Customer customers=(Customer)o;//downcasting
//			return this.email.equals(customers.email);
//					
//		}
//		return false;
//	}
	
	
	 
	
	
	
	

}
