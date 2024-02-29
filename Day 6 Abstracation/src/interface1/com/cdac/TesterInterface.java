package interface1.com.cdac;

public class TesterInterface {

	public static void main(String[] args) 
	{

		Printer[] p1= {new ConsolePrinter(),new FilePrinter(),new NetworkPrinter()};
		
		
		for(Printer p : p1)
		{
			if(p instanceof FilePrinter)
			{
				FilePrinter np=(FilePrinter)p;
				np.enterData();
				np.print("Hello");
				np.exitData();
			}
			
			else if (p instanceof NetworkPrinter)
			{
				System.out.println();
				NetworkPrinter np=(NetworkPrinter) p;
				np.enterData();
				np.print("Lalit");
				np.exitData();
			}
		}
		
		

	}

}
