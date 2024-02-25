package com;

import java.time.LocalDate;
import java.util.Date;

public class Grocery {
	
	private String name;
	private int price;
	private int quantity;
	private LocalDate stockUpdateDate;
	
	
	public Grocery(String name, int price, int quantity,LocalDate stockUpdateDate) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.stockUpdateDate = stockUpdateDate;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}


	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}


	@Override
	public String toString() {
		return "Grocery [name=" + name + ", price=" + price + ", quantity=" + quantity + ", stockUpdateDate="
				+ stockUpdateDate + "]";
	}
	
	
	
	

}
