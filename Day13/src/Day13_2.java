import java.util.Iterator;
import java.util.Stack;

//search() in Stack
//Returns the 1-based position where an object is on this stack. 
//the topmost item on the stack is considered to be at distance 1
//return value -1 indicates that the object is not on the stack

public class Day13_2 
{

	public static void main(String[] args) 
	{
		//create object of Stack type
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10); //7 
		stk.push(20); // 6 
		stk.push(30); //5 
		stk.push(40); // 4
		stk.push(50); // 3
		stk.push(60);  //2
		stk.push(70);   // 1 ==> top element ==> 1-based position
		System.out.println("Stack contents = "+stk); // stk.toSting()
		
		System.out.println("Element 10 is present at "+stk.search(10));
		System.out.println("Element 60 is present at "+stk.search(60));
		System.out.println("Element 70 is present at "+stk.search(70));
		System.out.println("Element 88 is present at "+stk.search(88));
	}
}

//push() , peek() and  pop()

/*
public class Day13_2 
{

	public static void main(String[] args) 
	{
		//create object of Stack type
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		System.out.println("Stack contents = "+stk); // stk.toString()
		System.out.println("is stack Empty?? "+stk.empty());
		while(!stk.empty())
		{
			int element = stk.peek();
			System.out.println("Element at top ="+element);
			System.out.println("Pop element "+stk.pop());
		}
		
		System.out.println("is stack Empty?? "+stk.empty());
	}
}

*/



//checking whether the stack is empty()
// pop the elements of stack till stack becomes empty
/*
public class Day13_2 
{

	public static void main(String[] args) 
	{
		//create object of Stack type
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		System.out.println("Stack contents = "+stk); // stk.toString()
		System.out.println("is stack Empty?? "+stk.empty());
		while(!stk.empty())
			System.out.println("Pop element "+stk.pop());
		
		System.out.println("is stack Empty?? "+stk.empty());
	}
}
*/


// push() and pop() example

/*
public class Day13_2 
{

	public static void main(String[] args) 
	{
		//create object of Stack type
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		System.out.println("Stack contents = "+stk); // stk.toString()
		System.out.println("Element popped out = "+stk.pop());
		System.out.println("Element popped out = "+stk.pop());
		System.out.println("Element popped out = "+stk.pop());
		System.out.println("Element popped out = "+stk.pop());
		System.out.println("Element popped out = "+stk.pop());
		
	}
}
*/


// push() , iterator() in Stack 

/*
public class Day13_2 {

	public static void main(String[] args) 
	{
		//create object of Stack type
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		System.out.println("Stack contents = "+stk); // stk.toString()
		
		Iterator<Integer> itr = stk.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+"\t");
		
		
	}

}
*/