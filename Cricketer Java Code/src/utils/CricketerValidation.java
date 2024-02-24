package utils;

import java.util.Map;

import com.Cricketer;

public class CricketerValidation 
{
	public static Cricketer addAllCricketer(String name, int age, String email, int rating,Map<String, Cricketer> cric)
	{
		return new Cricketer(name, age, email, rating);
	}
}
