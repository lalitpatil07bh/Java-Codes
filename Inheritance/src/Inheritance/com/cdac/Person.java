package Inheritance.com.cdac;

public class Person 
{
	private String firstname;
	private String lastname;
	
	public Person(String fn,String ln)
	{
		firstname=fn;
		lastname=ln;
	}
	
	public String getDetails()
	{
		return firstname+"  "+lastname;
	}
}
