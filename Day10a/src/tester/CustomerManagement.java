package tester;

import static utils.CustomerValidationRules.validateAll;
import static utils.CustomerUtilities.findByEmail;
import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import core.Customer;
import custom_ordering.CustomerDobLastNameComparator;
import utils.CustomerUtilities;

public class CustomerManagement {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			List<Customer> customerList = CustomerUtilities.populateCustomers();
			boolean exit = false;
			Customer cust;
			while (!exit) {

				System.out.println("1. Sign up");
				System.out.println("2. Sign in");
				System.out.println("3. Change password");
				System.out.println("4. Un subscribe customer");
				System.out.println("5. Display all customers.");
				System.out.println("6. Sort customer details as per email");
				System.out.println("7. Sort customer details as per dob & last name");
				System.out.println(
						"8. Remove all those customer details whose subscription is pending for last 6 months");
				System.out.println("9. Pay for subscription");
				System.out.println("0. Exit");
				System.out.println("Choose an option");

				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter customer details: firstName, lastName, email, password, registrationAmount, date of birth, service plan");
						cust = validateAll(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								sc.next(), customerList);
						customerList.add(cust);
						System.out.println("Customer added successfully");
						break;

					case 2:
						System.out.println("Enter your email & password");

						String email = sc.next();
						String pass = sc.next();
						cust = findByEmail(email, customerList);

						if ((cust.getPassword()).equals(pass)) {
							System.out.println("Logged in successfully");
						} else {
							System.out.println("Password incorrect!!!");
						}
						break;

					case 3:
						System.out.println("Enter your email, old password");
						String email2 = sc.next();
						String oldPass = sc.next();
						cust = findByEmail(email2, customerList);

						if ((cust.getPassword()).equals(oldPass)) {
							boolean setPass = false;
							while (!setPass) {
								System.out.println("Enter new password");
								String newPass = sc.next();
								if (newPass.equals(oldPass)) {
									System.out.println("New password must not be same as old password!!!");
								} else {
									cust.setPassword(newPass);
									System.out.println("Password updated successfully");
									setPass = true;
								}
							}
						} else {
							System.out.println("Password incorrect!!!");
						}
						break;

					case 4:
						System.out.println("Enter email: ");
						String email3 = sc.next();
						cust = findByEmail(email3, customerList);
						customerList.remove(cust);
						System.out.println("Customer removed successfully");
						break;

					case 5:
						System.out.println("Customer details: ");
						for (Customer c : customerList) {
							System.out.println(c);
						}
						break;

					case 6:
						Collections.sort(customerList);
						System.out.println("Customer details after sorting as per email: ");
						for (Customer c : customerList) {
							System.out.println(c);
						}
						break;

					case 7:
						customerList.sort(new CustomerDobLastNameComparator());
						System.out.println("Customer details after sorting as per dob & last name: ");
						for (Customer c : customerList) {
							System.out.println(c);
						}
						break;

					case 8:
						Iterator<Customer> itr = customerList.iterator();
						while (itr.hasNext()) {
							if ((Period.between(itr.next().getLastPaidDate(), LocalDate.now()).toTotalMonths()) > 6) {
								itr.remove();
							}
						}
						System.out.println("Removed successfully");
						for (Customer c : customerList) {
							System.out.println(c);
						}
						break;

					case 9:
						System.out.println("Enter customer email");
						cust = findByEmail(sc.next(), customerList);
						System.out.println("Enter paid date");
						cust.setLastPaidDate(parse(sc.next()));
						break;
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Try again...");
					sc.nextLine();
				}
			}
		}

	}

}
