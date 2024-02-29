package interface1.com.cdac;

public class ConsolePrinter implements Printer {
	
	@Override
	public void print(String message)
	{
		System.out.println("Hello inside ConsolePrinter"+" "+message);
	}

}
