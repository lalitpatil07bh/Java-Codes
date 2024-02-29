package abstracation.com.cdac;

public class TesterShape {

	public static void main(String[] args)
	
	{
		//Array Reference using multipe class
		//// add sample data (dyn init of array) in a single java statement
		Shape [] shape=  { new Circle(10,10,20),
				   new Rectangle(10, 20, 30, 50)};
		
		for(Shape s :shape)
		{
			System.out.println(s);
		    System.out.println(s.area());
		}
		
		Rectangle r1=new Rectangle(0, 0, 0, 0);
		Rectangle r2=new Rectangle(0, 10, 0, 0);
		
		System.out.println(r1==r2);
		Rectangle r3=r2;
		
		System.out.println(r2==r3);
		System.out.println(r2.equals(r3));
	}

}
