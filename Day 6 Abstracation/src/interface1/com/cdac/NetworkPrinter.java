package interface1.com.cdac;

public class NetworkPrinter implements Printer
{
	@Override
	public void print(String message)
	{
		System.out.println("Inside Network Printer "+message);
				
	}
	public void enterData()
	{
		System.out.println("Data is enter in Network printer");
	}
	
	public void exitData()
	{
		System.out.println("Exit from the Network printer");
	}
}
