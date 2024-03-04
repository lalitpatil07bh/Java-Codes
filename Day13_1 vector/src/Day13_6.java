import java.util.Vector;

//Vector class methods 

public class Day13_6 {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();
		vec.addElement(25);
		vec.addElement(35);
		vec.addElement(45);
		vec.addElement(55);
		System.out.println("Vector elements = "+vec);
		System.out.println("Contains value 55? "+vec.contains(55));
		System.out.println("Element at location 2 = "+vec.elementAt(2));
		System.out.println("First Element = "+vec.firstElement());
		System.out.println("Get the element at index = "+vec.get(2));
		System.out.println("Is empty ? "+vec.isEmpty());
		System.out.println("Last Element = "+vec.lastElement());
		
		
		

	}

}
