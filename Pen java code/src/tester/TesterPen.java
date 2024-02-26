package tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.Brand;
import com.Material;
import com.Pen;

import custom_exception.Custom_Exception_Pen;
import utils.PenValidation;

public class TesterPen {

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			Map<Integer, Pen> mapPen=new HashMap<>();
			boolean exit=false;
			
			try {
				while(!exit)
				{
					System.out.println("1. Add\n2. Update stock\n3. Set discount of 20% which not sold in 3 months\n"
							+ "4.Remove pens not sold from 9 months\n5. Display all\n6. Sort by update date\n7. sort by price in desc order\n"
							+ "\n8. remove pen price less than 20\n9. Remove pens of alloy steel\n10. Remove pens of specific brand enter by user\n"
							+ "11. remove pen if qty is 0\n0. Exit");
					System.out.println("Enter the choice...");
					
					switch (sc.nextInt()) {
					case 1://Add the data
						
						System.out.println("Brand penBrand, Material penMaterial, String color, String inkColor, int stock, LocalDate updatedate,\r\n"
								+ "			LocalDate listingdate, int price, int discount");
						Pen validateAllPen = PenValidation.ValidateAllPen(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(),
								sc.next(), sc.next(), sc.nextInt(), mapPen);
						mapPen.put(validateAllPen.getId(), validateAllPen);
						break;
						
					case 2://Update stock
						System.out.println("Enter the id");
						int ids=sc.nextInt();
						
						if(mapPen.containsKey(ids))
						{
							System.out.println("Enter the Quantity");
							int qt=sc.nextInt();
							mapPen.get(ids).setStock(qt);
							System.out.println("Quantity update....");
							mapPen.get(ids).setUpdatedate(LocalDate.now());
						}
						else
						{
							throw new Custom_Exception_Pen("Not valid id...");
						}
						
					case 3://set Discount not sold in last 3month
						
						LocalDate today=LocalDate.now();
						LocalDate d1=today.minusMonths(3);
						
						for(Pen p1:mapPen.values())
						{
							if(p1.getUpdatedate().isBefore(d1))
							{
								p1.setDiscount(p1.getPrice()-p1.getPrice()*0.2);
							}
						}
						System.out.println("Discount Added Succefully...");
						break;
						
					case 4://Remove pen which not sold from 9 months
						LocalDate t1=LocalDate.now();
						LocalDate d2=t1.minusMonths(9);
						
						for(Pen p : mapPen.values())
						{
							if(p.getUpdatedate().isBefore(d2))
							{
								mapPen.remove(p);
							}
						}
						System.out.println("Pen Remove Sussccefully...");
						break;
					case 5://Display All
						for(Pen p : mapPen.values())
							System.out.println(p);
						break;
					case 6: //Sort by update date
						
						mapPen.values().stream()
						.sorted((a,b)->a.getUpdatedate().compareTo(b.getUpdatedate()))
						.forEach(i->System.out.println(i));
						
					
					case 7: //sort by price
						
						mapPen.values().stream()
						.sorted((a,b)->((Integer)b.getPrice()).compareTo(a.getPrice()))
						.forEach(i->System.out.println(i));
						
					case 8://remove pen price less than 20
						
						for(Pen p :mapPen.values())
						{
							if(p.getPrice()<20)
							{
								mapPen.remove(p);
							}
						}
					case 9: //Remove pens of alloy steel
						
						for(Pen p1 : mapPen.values())
						{
							if(p1.getPenMaterial()==Material.ALLOYSTEEL)
							{
								mapPen.remove(p1);
							}
						}
						System.out.println("Alloy Steel pen has been removed...");
						
					case 10://Remove pens of specific brand enter by user
						
						System.out.println("Enter the brand that you want to Remove");
						String brand1=sc.next().toUpperCase();
						Brand parseBrand = PenValidation.parseBrand(brand1);
						
						for(Pen p1 : mapPen.values())
						{
							if(p1.getPenBrand()==parseBrand)
							{
								mapPen.remove(p1);
							}
						}
						break;
						
					case 11://remove pen which has quantity is 0
						
						for(Pen p3 :mapPen.values())
						{
							if(p3.getStock()==0)
							{
								mapPen.remove(p3);
							}
						}
						System.out.println("Pen Removed Successfully...");
						
			
					default:
						break;
					}
				}
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
