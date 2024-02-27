package utils;

import java.time.LocalDate;
import java.util.Map;

import com.Employee;
import com.FullTimeEmp;
import com.PartTimeEmp;

import custom_exception.Custom_Exception_Employee;

public class ValidationEmployee 
{
	public static void checkForAadhar(long aadharNo, Map<Long,Employee> mapAddhar) throws Custom_Exception_Employee
	{
		if(mapAddhar.containsKey(aadharNo))
			throw new Custom_Exception_Employee("Aadhar Num is Duplicate");
		System.out.println("AdharNum is valid");
	}
	
	public static PartTimeEmp validatePTE(String name, String doj, long phno, long aadharNo,double hourPayement,Map<Long, Employee> mapPTE) throws Custom_Exception_Employee
	{
		checkForAadhar(aadharNo, mapPTE);
		LocalDate parsePTE=LocalDate.parse(doj);
		return new PartTimeEmp(name, parsePTE, phno, aadharNo, hourPayement);
	}
	
	public static FullTimeEmp validateFTE(String name, String doj, long phno, long aadharNo,double sal,Map<Long, Employee> mapFTE) throws Custom_Exception_Employee
	{
		checkForAadhar(aadharNo, mapFTE);
		LocalDate parseFTE = LocalDate.parse(doj);
		return new FullTimeEmp(name, parseFTE, phno, aadharNo, sal);
	}
}
