package com;

import java.time.LocalDate;

public class FullTimeEmp extends Employee
{
	private double sal;
	public FullTimeEmp(String name, LocalDate doj, long phno, long aadharNo,double sal)
	{
		super(name, doj, phno, aadharNo);
		this.sal=sal;
	}
	
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return super.toString()+"FullTimeEmp [sal=" + sal + "]";
	}
	
	


	
	

}
