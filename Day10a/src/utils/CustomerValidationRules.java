package utils;

import java.time.LocalDate;
import java.util.List;

import core.Customer;
import core.ServicePlan;
import custom_exception.CustomerHandlingException;

public class CustomerValidationRules {

	public static void checkDuplicate(String email, List<Customer> customerList) throws CustomerHandlingException {

		Customer newCustomer = new Customer(email);
		if (customerList.contains(newCustomer)) {
			throw new CustomerHandlingException("Customer is already present");
		}
		System.out.println("No duplicate present");
	}

	public static ServicePlan parseAndCheckPlan(String plan) throws IllegalArgumentException {

		return ServicePlan.valueOf(plan.toUpperCase());
	}

	public static LocalDate parseAndCheckDate(String date) throws CustomerHandlingException {

		LocalDate valid = LocalDate.parse("2000-01-01");
		LocalDate newDate = LocalDate.parse(date);
		if (newDate.isBefore(valid)) {
			throw new CustomerHandlingException("Invalid Date of Birth!!!");
		}
		return newDate;
	}

	public static void checkRegAmountWithPlan(double regAmount, ServicePlan plan) throws CustomerHandlingException {

		if (regAmount != plan.getCharges()) {
			throw new CustomerHandlingException("Registration Amount not matched with Service Plan");
		}
//		System.out.println("Registration Amount matched with Service Plan");
	}

	public static Customer validateAll(String firstName, String lastName, String email, String password,
			double registrationAmount, String dob, String plan, List<Customer> customerList)
			throws CustomerHandlingException {

		checkDuplicate(email, customerList);
		LocalDate newDob = parseAndCheckDate(dob);
		ServicePlan newPlan = parseAndCheckPlan(plan);
		checkRegAmountWithPlan(registrationAmount, newPlan);
		Customer newCustomer = new Customer(firstName, lastName, email, password, registrationAmount, newDob, newPlan);
		return newCustomer;
	}
}
