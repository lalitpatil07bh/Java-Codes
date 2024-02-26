package utils;

import java.time.LocalDate;
import java.util.Map;

import com.Brand;
import com.Material;
import com.Pen;

public class PenValidation 
{
	public static Material parseMaterial(String material) 
	{
		return Material.valueOf(material.toUpperCase());
	}
	
	public static Brand parseBrand(String brand)
	{
		return Brand.valueOf(brand.toUpperCase());
	}
	
	public static Pen ValidateAllPen(String penBrand, String penMaterial, String color, String inkColor, int stock, String updatedate,
			String listingdate, int price,Map<Integer, Pen> mapPen)
	{
		Brand parseBrand = parseBrand(penBrand);
		Material parseMaterial = parseMaterial(penMaterial);
		LocalDate parseLd = LocalDate.parse(listingdate);
		LocalDate parseUd = LocalDate.parse(updatedate);
		
		return new Pen(parseBrand, parseMaterial, color, inkColor, stock, parseLd, parseUd, price);
	}
}
