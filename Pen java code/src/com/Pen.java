package com;

import java.time.LocalDate;

public class Pen 
{
	private static int idcounter=0;
	private int id;
	private Brand penBrand;
	private Material penMaterial;
	private String color;
	private String inkColor;
	private int stock;
	private LocalDate updatedate;
	private LocalDate listingdate;
	private int price;
	private double discount;
	
	
	public Pen(Brand penBrand, Material penMaterial, String color, String inkColor, int stock, LocalDate updatedate,
			LocalDate listingdate, int price) {
		super();
		
		this.id=++idcounter;
		this.penBrand = penBrand;
		this.penMaterial = penMaterial;
		this.color = color;
		this.inkColor = inkColor;
		this.stock = stock;
		this.updatedate = updatedate;
		this.listingdate = listingdate;
		this.price = price;
		this.discount = discount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Brand getPenBrand() {
		return penBrand;
	}


	public void setPenBrand(Brand penBrand) {
		this.penBrand = penBrand;
	}


	public Material getPenMaterial() {
		return penMaterial;
	}


	public void setPenMaterial(Material penMaterial) {
		this.penMaterial = penMaterial;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getInkColor() {
		return inkColor;
	}


	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public LocalDate getUpdatedate() {
		return updatedate;
	}


	public void setUpdatedate(LocalDate updatedate) {
		this.updatedate = updatedate;
	}


	public LocalDate getListingdate() {
		return listingdate;
	}


	public void setListingdate(LocalDate listingdate) {
		this.listingdate = listingdate;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	@Override
	public String toString() {
		return "Pen [id=" + id + ", color=" + color
				+ ", inkColor=" + inkColor + ", stock=" + stock + ", updatedate=" + updatedate + ", listingdate="
				+ listingdate + ", price=" + price + ", discount=" + discount + "]";
	}
	
	
	
	
	
	
	
}
