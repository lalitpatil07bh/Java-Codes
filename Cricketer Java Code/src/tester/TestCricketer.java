package tester;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.Cricketer;

import utils.CricketerValidation;

public class TestCricketer {

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			Map<String, Cricketer>mapcricketer=new HashMap<>();
			boolean exit=false;
			
			try
			{
				while(!exit)
				{
					System.out.println("1.Accept the details\n2. Modify Cricketer Rating\n3. Search Cricketer by Name\n4. Display All Cricketer\n5.Display All Cricketer in sorted manner");
					System.out.println("Enter the choice");
					
					switch (sc.nextInt()) 
					{
					case 1://add cricketer
						System.out.println("Enter the details of Cricketer String name, int age, String email, int rating");
						Cricketer addAllCricketer = CricketerValidation.addAllCricketer(sc.next(), sc.nextInt(), sc.next(),sc.nextInt() , mapcricketer);
						mapcricketer.put(addAllCricketer.getName().toLowerCase(), addAllCricketer);
						System.out.println("Cricketer Information is Added....");
						break;
						
					case 2://Modify Rating
						
						System.out.println("Enter the name of Cricketer ");
						Cricketer changeRating = mapcricketer.get(sc.next());
						System.out.println("Enter the New Rating");
						changeRating.setRating(sc.nextInt());
						System.out.println("Rating change...To see please choose option 4");
						
					case 3://Search Cricketer By Name
						
						System.out.println("Enter the name of Cricketr...");
						Cricketer cricketer = mapcricketer.get(sc.next().toLowerCase());
						//mapcricketer.get(sc.next());
						System.out.println(cricketer);
						
					case 4://Display All
						
					mapcricketer.values().forEach(p->System.out.println(p));
					
					case 5://sort by rating						
						mapcricketer.values().stream().sorted((a,b)->((Integer)a.getRating()).compareTo(b.getRating())).forEach(x->System.out.println(x));
						break;
						
					case 0:
						exit=true;
						break;
					}
				}
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}

	}

}
