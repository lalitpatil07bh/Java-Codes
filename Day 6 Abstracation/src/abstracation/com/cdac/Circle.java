package abstracation.com.cdac;
import static java.lang.Math.PI;
  public class Circle extends Shape {
	
	private int radius;
	
	public Circle(int x,int y, int radius)
	{
		super(x, y);
		this.radius=radius;
	}
	
	@Override
	public String toString()
	{
		return "Shape= "+super.toString()+"Radius="+radius;
	}
	
	@Override
	public String area()
	{
		return "Area of Circle="+ PI*radius*radius;
	}
	

}
