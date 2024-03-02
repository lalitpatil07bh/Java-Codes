package core;

import java.time.LocalDate;

/*
Hands on (Complete as much as possible!)

Customer management system
Supply Options
1. Sign up (customer registration)
2. Sign in (login)
i/p : email n password
3. Change password
i/p : email n old password n new password
4. Un subscribe customer
i/p : customer email

5. Display all customers.
0. Exit 

Design 
Identify the core classes/enums involved
1. Customer class (core class)
state  : customer id(int) ,first name, last name (string),email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
idGenerator : static 
Must generate customer ids automatically : auto increment)
PK(UID) : email

ctors 
1. all args ctor
2. PK based ctor

Will you need to override toString n equals ?


2. ServicePlan : enum
ServicePlan charges : 
SILVER : 1000 
GOLD : 2000
DIAMOND : 5000
PLATINUM : 10000


3. custom exception class

4. validation rules
4.1 no dup customers 
(i.e if the customer tries to register using existing email , throw exception)

4.2 Validate plan
plan must be of supported types

4.3 reg amount must match with the plan


5. Tester, with UI , scanner
Create a template as discussed n test the functionality
*/

public class Customer implements Comparable<Customer> {

	private int id;
	private static int DEFAULT;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private LocalDate lastPaidDate;

	static {
		DEFAULT = 1001;
	}

	public static int idGenerator() {
		return DEFAULT++;
	}

	public Customer(String firstName, String lastName, String email, String password, double registrationAmount,
			LocalDate dob, ServicePlan plan) {

		super();
		id = idGenerator();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
		this.lastPaidDate = LocalDate.now();
	}

	public Customer(String email) {
		super();
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", plan="
				+ plan + ", lastPaidDate=" + lastPaidDate + "]";
	}

	public boolean equals(Object obj) {

		if (obj instanceof Customer) {
			Customer anotherCustomer = (Customer) obj;
			return this.email.equals(anotherCustomer.email);
		}
		return false;
	}

	public int compareTo(Customer anotherCust) {

		System.out.println("in compareTo");
		return this.email.compareTo(anotherCust.email);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getLastPaidDate() {
		return lastPaidDate;
	}

	public void setLastPaidDate(LocalDate lastPaidDate) {
		this.lastPaidDate = LocalDate.now();
	}

}
