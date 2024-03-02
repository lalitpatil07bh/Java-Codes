package valiadtion_customer;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import custom_exception.Custom_Exception_Customer;
import valiadtion_customer.Validation_Customer;
import com.customer.*;

public class Validation_Customer 
{
	public static void checkDuplicateEmail(String email, Map<String,Customer> cusMap) throws Custom_Exception_Customer
	{
		if(cusMap.containsKey(email))
		{
			throw new Custom_Exception_Customer("Email already exists.....");
		}
		System.out.println("No duplicate...");
	}
	
	
	//add a static method to validate the service plan
	
	public static ServicePlan parseAndValidatePlan(String plan) throws IllegalArgumentException//exception is optionl
	{
		return ServicePlan.valueOf(plan.toUpperCase());
	}
	
	//Add a static method to validate the reg amout as per choosen plan
	
	public static void validateRegAmount(double regAmout,ServicePlan plan) throws Custom_Exception_Customer
	{
		if(regAmout!=plan.getplanCharges())
			throw new Custom_Exception_Customer("Reg Amount not match with the plan....");
		
		System.out.println("Amount Matches......");
	}
	
	//add parse method for date of birth
	
	public static LocalDate parseDob(String date)
	{
		return LocalDate.parse(date);
	}
	
	//validateall to invoke al validation rule
	
	public static Customer validateAllInput(String firstname, String lastname, String email, String password, double registration_amount,
			String dob, String plan, Map <String,Customer> map) throws Custom_Exception_Customer
	{
		checkDuplicateEmail(email,map );
		ServicePlan validatePlan = parseAndValidatePlan(plan);
		validateRegAmount(registration_amount, validatePlan);
		LocalDate dob2 = parseDob(dob);
		
		return new Customer(firstname, lastname, email, password, registration_amount, dob2, validatePlan);
	}
	
	public static boolean checkForSub(Map<String, Customer> map)
	{
		Scanner sc=new Scanner(System.in);
		for(Customer p1 : map.values())
		{
			System.out.println("Enter last date");
			p1.setLastPaidDate(sc.next());
			return (Period.between(p1.getLastPaidDate(), LocalDate.now()).toTotalMonths()>6);
		}
		return false;
	}
}
