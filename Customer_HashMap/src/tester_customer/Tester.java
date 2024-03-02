package tester_customer;
import static valiadtion_customer.Validation_Customer.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import com.customer.Customer;

import custom_exception.Custom_Exception_Customer;

public class Tester {

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			boolean exit =false;
			Map<String,Customer> customers =new  HashMap<>();
			while (!exit)
			{
				System.out.println("1. Sign up\n2.Sign in\n3.Change password\n4.Un subscribe\n5.Display All\n6. Sort By Email\n");
				System.out.println("Enter the choice");
				try 
				{
					switch (sc.nextInt())
					{
						case 1:
							//sign up logic
							System.out.println("String firstname, String lastname, String email, String password, double registration_amount,String dob, String plan");
							Customer customer=validateAllInput(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), customers);
							customers.put(customer.getEmail(), customer);
							
							System.out.println("customer Signed up....");
						break;
						
						case 2:
//							System.out.println("Enter the email");
//							String temp=sc.next();
//							if(customers.containsKey(temp)
//							{
//								Customer c1=customers.get(temp);
//								if(c1.getPassword()==sc.next())
//								{
//									System.out.println("Login Successful........");
//								}
//								else
//								{
//									throw new Custom_Exception_Customer("password not match....");
//								}
//							}
							
							customer=customers.get(sc.next());
							if(customer==null)
								throw new Custom_Exception_Customer("Invalid Email...");
							
							if(!customer.getPassword().equals(sc.next()))
								throw new Custom_Exception_Customer("Invalid Password....");
							System.out.println("Login Successful.....");
						break;
						
						case 3: //change Password
							
							System.out.println("Enter the Email ");
						    customer=customers.get(sc.next());
							if(customer==null)
								throw new Custom_Exception_Customer("Invalid Email....");
							
							System.out.println("Enter the new Password");
							String newPassword=sc.next();
							if(customer.getPassword().equals(newPassword))
								throw new Custom_Exception_Customer("Previous password and new Password is same plz write new");
							
							customer.setPassword(newPassword);
							System.out.println("Password change successful...");
							break;
							
						case 4: //unsubscribe the channel
							System.out.println("Enter the Email you want to Unsubscribe");
							String remove=sc.next();
							customer=customers.get(remove);
							if(customer==null)
								throw new Custom_Exception_Customer(" Email not exist....");
							
							customers.remove(remove);
							System.out.println("Customer get Unsubscribe.....");
							break;
							
						case 5://Display All
							
							for(Customer display : customers.values())
								System.out.println(display);
							break;
							
						case 6: //sort by eamil
							
							TreeMap<String , Customer> sortByEmail=new TreeMap<>(customers);
							for( Customer c : sortByEmail.values())
								System.out.println(c);
							System.out.println("Sorting by Email done.........");
							
						case 7://remove unsubcribe 6 months 
							//for(Map.Entry<String, Customer> entry :customers.entrySet());
							
							boolean checkForSub = checkForSub(customers);
							System.out.println(checkForSub);
							break;
							
					   case 8:
				} 
				}
				catch (Exception e) 
				{
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}
		}
	

}


/*
  jivan
shinde
jiv
jiv
2000
2022-02-11
gold
------
lalit
patil
lal
lal
1000
2023-02-12
silver

 */
