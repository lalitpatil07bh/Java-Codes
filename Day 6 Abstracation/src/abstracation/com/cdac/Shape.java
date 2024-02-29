package abstracation.com.cdac;

import java.util.Objects;

public abstract class Shape {
	
	private int x;
	private int y;
	
	public Shape(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString()
	{
		return "X="+x+" "+"Y="+y;
	}
	
	public abstract String  area();

	
}
