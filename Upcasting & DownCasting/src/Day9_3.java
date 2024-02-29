class Machine
{
	public void start()
	{
		System.out.println("Machine Started");
	}

}
class Laptop extends Machine
{
	public void start() // overridden method 
	{
		super.start();
		System.out.println("Laptop Started");
	}
	
	public void stop() // non overridden 
	{
		System.out.println("Laptop Stopped");
	}
	
}



class Computer extends Machine
{
	public void start() // overridden method 
	{
		super.start();
		System.out.println("Computer Started");
	}
	
	public void stop() // non overridden 
	{
		System.out.println("Computer Stopped");
	}
	
}
public class Day9_3 {

	public static void main(String[] args) 
	{
		Machine mobj = new Machine();
		//mobj ==> object ==> super class
		mobj.start(); //start() will be called from Machine class
		// mobj.stop(); // javac error 
		System.out.println("------------------------");
		Laptop lobj = new Laptop();
		lobj.start();
		lobj.stop();
		System.out.println("------------------------");
		
		Machine m2 = lobj; // UPCASTING 
		// m2 ===> ref ==> super type 
		// lobj ==> object ==> sub type
		// Laptop is-a Machine 
		
		m2.start(); // start() will be called from Laptop class 
		// C++ LATE BINDING 
		// RUN TIME POLYMORPHISIM // DYNAMIC METHOD DISPATCH
		
		//m2.stop(); // Not allowed 
		//stop() is non overridden method 
		
		System.out.println("------------------------");
		Machine m3 = new Laptop(); // UPCASTING
		m3.start(); // start() will be called from Laptop class
		System.out.println("------------------------");
		Laptop l1 =(Laptop) m3; // DOWNCASTING 
		//l1 ==> reference ==> sub type
		// m3 ==> reference ==> super type ==> it is holding object of Laptop type
		l1.start();
		l1.stop();
		
		
		System.out.println("------------------------");
		Computer c1 =(Computer)m3; //java.lang.ClassCastException:
		//c1 ==> reference ==> sub type ==> Computer type
		// m3 ==> reference ==> super type ==> holding object of Laptop type
		
		//ClassCastException is Thrown to indicate that the code has attempted
		// to cast an object to a subclass of which it is not an instance. 
		
		
		//Solution : we need to make m3 to hold Computer object first
		//and then cast it
		//m3 = new Computer();
		//Computer c1 =(Computer)m3;
		//c1.start();
		// c1.stop();
		
	}

}
