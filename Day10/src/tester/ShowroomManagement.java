package tester;

import static utils.ShowroomUtils.findByChasisNo;
import static utils.ShowroomUtils.populateShowroom;
import static utils.VehicleValidationRules.parseAndCheckColor;
import static utils.VehicleValidationRules.validateAll;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exceptions.VehicleHandlingException;
import custom_ordering.VehiclePriceComparator;

public class ShowroomManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

//			List<Vehicle> vehicleList = new ArrayList<>();
			List<Vehicle> vehicleList = populateShowroom();
			Vehicle vehicle;
			boolean exit = false;
			while (!exit) {

				System.out.println("1. Add a Vehicle");
				System.out.println("2. Display All");
				System.out.println("3. Get Specific Vehicle details");
				System.out.println("4. Apply Discount");
				System.out.println("5. Apply discount on all vehicles by color");
				System.out.println("6. Delete vehicle details by PK");
				System.out.println("7. Delete vehicle details by Color");
				System.out.println("8. Sort the vehicles as per ch no");
				System.out.println("9. Sort the vehicles as per price");
				System.out.println("0. Exit");
				System.out.println("Choose an option");

				try {
					switch (sc.nextInt()) {

					case 1:
						System.out.println(
								"Enter vehicle details: chasisNo,  vehicleColor,  basePrice,  manufactureDate, company ");
						Vehicle newVehicle = validateAll(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next(),
								vehicleList);
						vehicleList.add(newVehicle);
						System.out.println("Vehicle added to showroom successfully");
						break;

					case 2:
						System.out.println("Showroom details");
						for (Vehicle v : vehicleList) {
							System.out.println(v);
						}
						break;

					case 3:
						System.out.println("Enter chasis no , to get vehicle details");
						vehicle = findByChasisNo(sc.next(), vehicleList);
						System.out.println(vehicle);
						break;

					case 4:
						System.out.println("Enter chasis no & Discount");
						vehicle = findByChasisNo(sc.next(), vehicleList);
						vehicle.setBasePrice(vehicle.getBasePrice() - sc.nextInt());
						System.out.println("Discount applied....");
						break;

					case 5:
						System.out.println("Enter color for which you want discount & discount amount");
						Color color = parseAndCheckColor(sc.next());
						int discount = sc.nextInt();
						for (Vehicle v : vehicleList) {
							if (v.getVehicleColor().equals(color)) {
								v.setBasePrice(v.getBasePrice() - discount);
							}
						}
						System.out.println("Vehicles discounted : ");
						break;

					case 6:
						System.out.println("Enter chasis no of vehicle you want to delete");
						Vehicle v = new Vehicle(sc.next());
						if (vehicleList.remove(v)) {
							System.out.println("Vehicle removed successfully");
						} else {
							throw new VehicleHandlingException("Inavalid chasis no");
						}

						break;
						
					case 7:
						System.out.println("Enter color ");
						Color color1 = parseAndCheckColor(sc.next());
//						for (Vehicle v1 : vehicleList) {
//							if (v1.getVehicleColor() == color1) {
//								vehicleList.remove(v1);
//							}
//						} //java.util.ConcurrentModificationException
						Iterator<Vehicle> itr = vehicleList.iterator();
						Vehicle v1;
						while(itr.hasNext()) {
							v1 = itr.next();
							if(v1.getVehicleColor().equals(color1)) {
								itr.remove();
								System.out.println("Removed vehicle with chasis no: " + v1.getChasisNo());
							}
						}
						break;
						
					case 8:
						Collections.sort(vehicleList);
						System.out.println("Showroom details after sorted by chasis no");
						for (Vehicle v3 : vehicleList) {
					 		System.out.println(v3);
						}
						break;
						
					case 9:
						vehicleList.sort(new VehiclePriceComparator());
						System.out.println("Showroom details after sorted by Base Price");
						for (Vehicle v3 : vehicleList) {
					 		System.out.println(v3);
						}
						break;
						
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Please retry...");
					sc.nextLine();
				}
			}
		}
		System.out.println("main over...");

	}

}
