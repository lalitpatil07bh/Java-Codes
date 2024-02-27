package custom_ordering;

import java.util.Comparator;

import com.app.core.Vehicle;

public class VehiclePriceComparator implements Comparator<Vehicle>{
	
	public int compare(Vehicle v1, Vehicle v2) {
		if(v1.getBasePrice() > v2.getBasePrice()) {
			return 1;
		}
		if(v1.getBasePrice() < v2.getBasePrice()) {
			return -1;
		}
		return 0;
	}
}
