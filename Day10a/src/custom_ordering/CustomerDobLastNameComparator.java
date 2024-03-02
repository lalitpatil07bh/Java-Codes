package custom_ordering;

import java.util.Comparator;

import core.Customer;

public class CustomerDobLastNameComparator implements Comparator<Customer> {

	public int compare(Customer c1, Customer c2) {
		if (c1.getDob().equals(c2.getDob())) {
			return c1.getLastName().compareTo(c2.getLastName());
		}
		return c1.getDob().compareTo(c2.getDob());
	}
}
