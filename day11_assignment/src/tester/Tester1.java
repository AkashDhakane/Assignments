package tester;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.vehicles.Vehicle;

import custom_exception.VehicleHandlingException;

import static utils.VehicleValidationRules.*;

public class Tester1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create empty AL to hold Vehicle type of ref
			ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println(
							"1. Add Vehicle\n2. Display details of vehicle in showroom\n3. Display vehicle details\n4. Update price\n5. Delete Vehicle\n6. Apply discount\n7. Purchase\n8. vehicles by city\n100. Exit");
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter Vehicle details : chasisNo,  color,  price,  manufactureDate, category");
						Vehicle v1 = validateAllInputs(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next(), sc.next(),
								vehicles);

						vehicles.add(v1);
						System.out.println("vehicle added to the showroom");
						break;
					case 2:
						System.out.println("Showroom details ");
						for (Vehicle v : vehicles)
								System.out.println(v);
						break;
					case 3:
						System.out.println("Enter chasis no");
						System.out.println(findByChasisNo(sc.nextInt(), vehicles) );
						break;
					case 4:
						System.out.println("Enter chasis no and new price :");
						updatePrice(sc.nextInt(),sc.nextDouble(), vehicles);
						break;
					case 5:
						System.out.println("Enter chasis no");
						deleteVehicle(sc.nextInt(), vehicles);
						break;
					case 6:
						System.out.println("Enter end_date(dd-MM-yyyy) category and discount(%)");
						applyDiscount(sc.next(), sc.next(), sc.nextDouble(), vehicles);
						break;
					case 7:
						System.out.println("Enter chasis no");
						int chasisNo = sc.nextInt();
						Vehicle v = findByChasisNo(chasisNo, vehicles);
						if (v.getAddress() == null) {
							// not yet sold!
							System.out.println("Enter delivery adr : city state country zipCode");
							// link
							v.assignDeliveryAddress(sc.next(), sc.next(), sc.next(), sc.next());
							System.out.println("Address linked to a vehicle!!!!");
						} else
							throw new VehicleHandlingException(
									"Vehicle with chasis no " + chasisNo + " already sold!!!");
						break;
					case 8:
						System.out.println("Enter city");
						vehicleByCity(sc.next(), vehicles);
						break;
					
					case 100:
						System.out.println("Ok Byeeee");
						exit = true;
						break;
					default:
						System.out.println("Invalid Choice!!!");
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				// to clean buffer in case of looping err
				sc.nextLine();
			}

		}

	}

}
