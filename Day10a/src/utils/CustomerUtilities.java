package utils;

import java.util.ArrayList;
import java.util.List;
import static java.time.LocalDate.parse;

import core.Customer;
import core.ServicePlan;
import custom_exception.CustomerHandlingException;

public class CustomerUtilities {

	public static Customer findByEmail(String email, List<Customer> customerList) throws CustomerHandlingException {

		Customer newCust = new Customer(email);
		int index = customerList.indexOf(newCust);
		if (index == -1) {
			throw new CustomerHandlingException("Customer is not present");
		}
		Customer cust = customerList.get(index);
		return cust;
	}

	public static ArrayList<Customer> populateCustomers() {
		ArrayList<Customer> newArrayList = new ArrayList<Customer>();
		newArrayList.add(new Customer("falgun", "padme", "f@gmail.com", "pass", 10000, parse("2023-10-08"),
				ServicePlan.PLATINUM));
		newArrayList.add(new Customer("bhavesh", "kolhe", "b@gmail.com", "pass", 10000, parse("2023-04-18"),
				ServicePlan.PLATINUM));
		newArrayList.add(new Customer("shubham", "mhaske", "s@gmail.com", "pass", 10000, parse("2022-10-18"),
				ServicePlan.PLATINUM));
		newArrayList.add(new Customer("karan", "bhargare", "k@gmail.com", "pass", 10000, parse("2022-10-18"),
				ServicePlan.PLATINUM));

		return newArrayList;
	}
}
