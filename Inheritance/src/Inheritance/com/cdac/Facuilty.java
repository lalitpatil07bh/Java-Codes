package Inheritance.com.cdac;

public class Facuilty extends Person
{
	int exp;
	String field;
	
	public Facuilty(String fn,String ln,int exp,String field) 
	{
		super(fn,ln);
		this.exp=exp;
		this.field=field;
	}
	public String getDetails()
	{
		return "Facuilty= "+super.getDetails()+" Experience="+exp+" Field="+field ;
		
	}
}
