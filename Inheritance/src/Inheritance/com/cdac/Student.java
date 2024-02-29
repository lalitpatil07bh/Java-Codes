package Inheritance.com.cdac;

public class Student extends Person
{
	private int gradyear;
	private String course;
	private int marks;
	
	
	public Student(String fn,String ln,int gradyear,String course,int marks)
	{
		super(fn,ln);
		this.gradyear=gradyear;
		this.course=course;
		this.marks=marks;
	}
	
	public String getDetails()
	{
		return "student="+super.getDetails()+" Passout Year="+gradyear+" Course="+course+" Marks="+marks;
	}
}
