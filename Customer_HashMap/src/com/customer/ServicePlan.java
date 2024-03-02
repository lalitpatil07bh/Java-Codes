package com.customer;

public enum ServicePlan {
	
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private int plancharges;
	private ServicePlan(int plancharges) 
	{
		//super(name,ordinal)
		this.plancharges=plancharges;
	}
	
	public void setplanCharges(int plancharges)
	{
	this.plancharges=plancharges;
	}
	
	public int getplanCharges()
	{
		return this.plancharges;
	}
	
	public String toString()
	{
		return name()+"cost="+plancharges;
	}
	

}
