package abstracation.com.cdac;

import java.util.Objects;

public class Rectangle extends Shape 
{
	private int length;
	private int breadth;
	
	public Rectangle(int x,int y,int len,int bre)
	{
		super(x,y);
		length=len;
		breadth=bre;
	}
	
	@Override
	public String toString()
	{
		return "Shape" + super.toString()+ " "+ " length="+length+" breadth="+breadth;
	}
	
	@Override
	public String area()
	{
		return "Area of Rectangle="+length*breadth;
	}
}
