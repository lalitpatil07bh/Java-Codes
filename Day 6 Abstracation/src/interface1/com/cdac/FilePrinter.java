package interface1.com.cdac;

public class FilePrinter implements Printer{
	
	@Override
	public void print(String message)
	{
		System.out.println("Inside the FilePrinter "+message);
	}
	
	
	public void enterData()
	{
		System.out.println("Data is enter in File printer");
	}
	
	public void exitData()
	{
		System.out.println("Exit from the File printer");
	}

}
