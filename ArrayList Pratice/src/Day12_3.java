import java.util.ArrayList;


// ArrayList and functions
// we can pass AL to the function as an argument

public class Day12_3 
{

	public static void getIntegerList(ArrayList<Integer> list)
	{
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
	}
	
	public static void getDoubleList(ArrayList<Double> list)
	{
		list.add(5.1);
		list.add(6.2);
		list.add(7.3);
		list.add(8.4);
	}
	
	
	public static void getFloatList(ArrayList<Float> list)
	{
		list.add(3.2f);
		list.add(8.2f);
		list.add(12.3f);
		list.add(9.4f);
	}
	
	public static void getStringList(ArrayList<String> list)
	{
		list.add("Java");
		list.add("Python");
		list.add("MachineLearning");
		list.add("C++");
	}
	
	
	
	public static void printIntegerList(ArrayList<Integer> list)
	{
		System.out.println("Integer List = "+list);
	}
	
	public static void printDoubleList(ArrayList<Double> list)
	{
		System.out.println("Double List = "+list);
	}
	
	
	public static void printFloatList(ArrayList<Float> list)
	{
		System.out.println("Float List = "+list);
	}
	
	public static void printStringList(ArrayList<String> list)
	{
		System.out.println("String List = "+list);
	}
	
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Double> l2 = new ArrayList<Double>();
		ArrayList<Float> l3 = new ArrayList<Float>();
		ArrayList<String> l4 = new ArrayList<String>();
		getIntegerList(l1);
		printIntegerList(l1);
		
		getDoubleList(l2);
		printDoubleList(l2);
		
		getFloatList(l3);
		printFloatList(l3);
		
		getStringList(l4);
		printStringList(l4);
		
		
		
	}

}
