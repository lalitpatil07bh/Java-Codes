package utils;

import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.List;

import com.app.core.Color;
import com.app.core.Vehicle;
import custom_exceptions.VehicleHandlingException;

public class ShowroomUtils {

	public static Vehicle findByChasisNo(String chasisNo, List<Vehicle> vehicleList) throws VehicleHandlingException {

		Vehicle v = new Vehicle(chasisNo);
		int index = vehicleList.indexOf(v);
		if (index == -1) {
			throw new VehicleHandlingException("No such vehicle present");
		}
		Vehicle vehicle = vehicleList.get(index);
		return vehicle;
	}
	public static List<Vehicle> populateShowroom() {
		
		List<Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(new Vehicle("abc-1000", Color.BLACK, 200000, parse("2023-01-01"), "Mahindra"));
		
		vehicles.add(new Vehicle("abc-1010", Color.WHITE, 250000, parse("2022-01-01"), "Honda"));

		vehicles.add(new Vehicle("abc-1003", Color.WHITE, 230000, parse("2021-11-05"), "Maruti"));

		vehicles.add(new Vehicle("abc-1002", Color.GREY, 280000, parse("2022-06-01"), "Mahindra"));

		vehicles.add(new Vehicle("abc-1009", Color.SILVER, 250000, parse("2023-08-01"), "Honda"));

		vehicles.add(new Vehicle("abc-1005", Color.BLACK, 240000, parse("2020-11-01"), "Mahindra"));

		vehicles.add(new Vehicle("abc-1007", Color.BLACK, 290000, parse("2022-11-23"), "Maruti"));

		return vehicles;
	}
}
