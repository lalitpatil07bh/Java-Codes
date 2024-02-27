package com;

import java.time.LocalDate;

public class PartTimeEmp extends Employee
{
	private double hourPayement;
	
	public PartTimeEmp(String name, LocalDate doj, long phno, long aadharNo,double hourPayement) {
		super(name, doj, phno, aadharNo);
		this.hourPayement=hourPayement;
		
	}


	public double getHourPayement() {
		return hourPayement;
	}

	public void setHourPayement(double hourPayement) {
		this.hourPayement = hourPayement;
	}

	@Override
	public String toString() {
		return super.toString()+"PartTimeEmp [hourPayement=" + hourPayement + "]";
	}

	
	
}
