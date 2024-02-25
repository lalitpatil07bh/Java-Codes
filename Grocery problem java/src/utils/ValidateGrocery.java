package utils;

import java.time.LocalDate;

import com.Grocery;

public class ValidateGrocery {
	
	public static Grocery addGrocery(String name,int price,int quantity,String date)
	{
		LocalDate parse = LocalDate.parse(date);
		return new Grocery(name, price, quantity,parse);
	}

}
