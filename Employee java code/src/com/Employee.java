package com;

import java.time.LocalDate;

public class Employee 
{
	private static int idCounter=0;
	private int empid;
	private String name;
	private LocalDate doj; 
	private long phno;
	private long aadharNo;
	
	public Employee(String name, LocalDate doj, long phno, long aadharNo) {
		super();
		this.empid=++idCounter;
		this.name = name;
		this.doj = doj;
		this.phno = phno;
		this.aadharNo = aadharNo;
	}
	
	public int getEmpid()
	{
		return empid;
	}
	public String getName() {
		return name;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public long getPhno() {
		return phno;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + " Name=" + name + ", doj=" + doj + ", phno=" + phno + ", aadharNo=" + aadharNo + "]";
	}
	
	
}
