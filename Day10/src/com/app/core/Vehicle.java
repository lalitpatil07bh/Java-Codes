package com.app.core;

import java.time.LocalDate;

public class Vehicle implements Comparable<Vehicle> {

	private String chasisNo;
	private Color vehicleColor;
	private int basePrice;
	private LocalDate manufactureDate;
	private String company;
	private boolean available;

	public Vehicle(String chasisNo, Color vehicleColor, int basePrice, LocalDate manufactureDate, String company) {

		super();
		this.chasisNo = chasisNo;
		this.vehicleColor = vehicleColor;
		this.basePrice = basePrice;
		this.manufactureDate = manufactureDate;
		this.company = company;
	}

	public Vehicle(String chasisNo) {
		super();
		this.chasisNo = chasisNo;
	}

	@Override
	public String toString() {
		return "Vehicle [ chasisNo = " + chasisNo + ", vehicleColor = " + vehicleColor + ", basePrice = " + basePrice
				+ ", manufactureDate = " + manufactureDate + ", company = " + company + ", available = " + available
				+ " ]";
	}

	public boolean equals(Object obj) {

		System.out.println("in vehicles's equals");
		if (obj instanceof Vehicle) {
			Vehicle anotherVehicle = (Vehicle) obj;
			return this.chasisNo.equals(anotherVehicle.chasisNo);
		}
		return false;
	}

	@Override
	public int compareTo(Vehicle anotherVehicle) {

		System.out.println("in compareTo");
		return this.chasisNo.compareTo(anotherVehicle.chasisNo);
	}

	public int getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}

	public String getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	public Color getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(Color vehicleColor) {
		this.vehicleColor = vehicleColor;
	}
}