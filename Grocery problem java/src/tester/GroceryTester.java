package tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.Grocery;

import cusom_exception.Custom_Exception_Grocery;
import utils.ValidateGrocery;

public class GroceryTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Grocery> mapGrocery = new HashMap<>();
			boolean exit = false;

			try {
				while (!exit) {
					System.out.println(
							"1.add grocery item \n2. Update the Quantity\n3.Display List of grocery item\n4.remove all empty stock items\n5.display all products for which stock updated (in last 3 days)\n 0.exit");
					System.out.println("Enter the choice");
					switch (sc.nextInt()) {
					case 1:// add the grocery
						System.out.println("Add name,int Price,int Quantity");
						Grocery addGrocery = ValidateGrocery.addGrocery(sc.next(), sc.nextInt(), sc.nextInt(),
								sc.next());
						mapGrocery.put(addGrocery.getName(), addGrocery);
						System.out.println("Grocery added......");
						break;

					case 2: // update the quantity
						System.out.println("Enter the name which you have to increase quantity");
						addGrocery = mapGrocery.get(sc.next());
						System.out.println("Enter the quantity");
						addGrocery.setQuantity(sc.nextInt());

						LocalDate today = LocalDate.now();
						addGrocery.setStockUpdateDate(today);
						break;

					case 3:// Display grocery item

						for (Grocery g : mapGrocery.values())
							System.out.println(g);

						break;

					case 4:// Remove iteam quantity is zero

//						Iterator<Grocery> itr = mapGrocery.values().iterator();
//						while (itr.hasNext()) {
//							Grocery grocery = (Grocery) itr.next();
//							if (grocery.getQuantity() == 0) {
//								itr.remove();
//								System.out.println("Iteam Removed... to check plz choose option 3");
//							}
//							continue;
//						}

//						 mapGrocery.values().removeIf(i->(i.getQuantity()==0));
//						System.out.println("Iteam removed....");
						
						for(Grocery g :mapGrocery.values())
						{
							if(g.getQuantity()==0)
							{
								mapGrocery.remove(g);
							}
						}

					case 5:
						for (Grocery g1 : mapGrocery.values()) {
							if (g1.getStockUpdateDate().isAfter(LocalDate.now().minusDays(3))) {
								System.out.println(g1);
							}
						}
						break;
					case 0:
						exit = true;
						break;
					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
