package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import com.app.core.Color;
import com.app.core.Vehicle;
import custom_exceptions.VehicleHandlingException;

public class VehicleValidationRules {

	public static void checkDuplicate(String chasisNo, List<Vehicle> vehicleList) throws VehicleHandlingException {

		Vehicle newVehicle = new Vehicle(chasisNo);
		if (vehicleList.contains(newVehicle)) {
			throw new VehicleHandlingException("Vehicle is already present");
		}
		System.out.println("No duplicate present");
	}

	public static Color parseAndCheckColor(String color) throws IllegalArgumentException {

		return Color.valueOf(color.toUpperCase());
	}

	public static LocalDate parseAndCheckDate(String date) throws VehicleHandlingException {

		LocalDate valid = LocalDate.parse("2020-01-01");
		LocalDate newDate = LocalDate.parse(date);
		if (newDate.isBefore(valid)) {
			throw new VehicleHandlingException("Invalid Manufature Date!!!");
		}
		return newDate;
	}

	public static Vehicle validateAll(String chasisNo, String vehicleColor, int basePrice, String manufactureDate,
			String company, List<Vehicle> vehicleList)
			throws VehicleHandlingException, IllegalArgumentException, DateTimeParseException {

		checkDuplicate(chasisNo, vehicleList);
		Color newColor = parseAndCheckColor(vehicleColor);
		LocalDate newDate = parseAndCheckDate(manufactureDate);

		Vehicle newVehicle = new Vehicle(chasisNo, newColor, basePrice, newDate, company);
		return newVehicle;
	}
}
