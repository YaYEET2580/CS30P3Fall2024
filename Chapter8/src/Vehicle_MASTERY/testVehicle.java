/*

Program: testVehicle.java          Last Date of this Revision: December 11, 2024

Purpose: A client code application that uses a Vehicle class that is an abstract class defining the general details and actions associated with
a vehicle. A Car, Truck, and Minivan class inherit the Vehicle class. The Car, Truck, and
Minivan classes includes additional members specific to the type of vehicle being represented.

Author: Sakibul Majid 
School: CHHS
Course: Computer Programming 30
 

*/


package Vehicle_MASTERY;

import java.util.*;
import java.text.*;

public class testVehicle {

	public static void main(String[] args) {
		// Create instances of Car, Minivan, and Truck with specific details
		Car vehicle1 = new Car("Toyota", "Camry", 2023, 30000, 8.5, 6.1, 5, 15.1);
		Minivan vehicle2 = new Minivan("Toyota", "Sienna", 2025, 55000, 6.6, 6.5, 7, 33.5);
		Truck vehicle3 = new Truck("Toyota", "Tundra", 2024, 70000, 12.7, 10.5, 5, 52.6);
		
		// Scanner for user input and NumberFormat for formatting prices
		Scanner input = new Scanner(System.in);
		NumberFormat price = NumberFormat.getCurrencyInstance();
		int optionVehicle;
		int optionChoice;
		
		// Display available vehicle options to the user
		System.out.println("1. Vehicle 1");
		System.out.println("2. Vehicle 2");
		System.out.println("3. Vehicle 3");
		System.out.print("Which mystery vehicle would you like to choose?: ");
		optionVehicle = input.nextInt();
		
		// Handle vehicle selection and option choices for vehicle details
		if (optionVehicle == 1) {
			System.out.println("List of options:");
			System.out.println("1. Vehicle Name and Year");
			System.out.println("2. Fuel Economy");
			System.out.println("3. Seating and Cargo Volume");
			System.out.println("4. Price");
			System.out.print("Which option would you like to choose?: ");
			optionChoice = input.nextInt();
			
			// Display chosen vehicle details based on user input
			if (optionChoice == 1) {
				System.out.println(vehicle1.getYear() + " " + vehicle1.getMake() + " " + vehicle1.getModel());
			}
			else if (optionChoice == 2) {
				System.out.println("Fuel Economy: " + vehicle1.getFuelEconomyCity() + " L/100 kilometers city and " + vehicle1.getFuelEconomyHwy() + " L/100 kilometers highway");
			}
			else if (optionChoice == 3) {
				System.out.println("Seating Capacity: " + vehicle1.getSeatingCapacity() + " | Cargo Volume: " + vehicle1.getCargoVolume() + " cubic feet");
			}
			else if (optionChoice == 4) {
				System.out.println("MSRP: " + price.format(vehicle1.getMSRP()));
			}
			else {
				System.out.println("Error: The option you have inputted has no meaning. Please try again.");
			}
		}
		
		else if (optionVehicle == 2) {
			System.out.println("List of options:");
			System.out.println("1. Vehicle Name and Year");
			System.out.println("2. Fuel Economy");
			System.out.println("3. Seating and Cargo Volume");
			System.out.println("4. Price");
			System.out.print("Which option would you like to choose?: ");
			optionChoice = input.nextInt();
			
			// Display chosen vehicle details based on user input
			if (optionChoice == 1) {
				System.out.println(vehicle2.getYear() + " " + vehicle2.getMake() + " " + vehicle2.getModel());
			}
			else if (optionChoice == 2) {
				System.out.println("Fuel Economy: " + vehicle2.getFuelEconomyCity() + " L/100 kilometers city and " + vehicle2.getFuelEconomyHwy() + " L/100 kilometers highway");
			}
			else if (optionChoice == 3) {
				System.out.println("Seating Capacity: " + vehicle2.getSeatingCapacity() + " | Cargo Volume: " + vehicle2.getCargoVolume() + " cubic feet");
			}
			else if (optionChoice == 4) {
				System.out.println("MSRP: " + price.format(vehicle2.getMSRP()));
			}
			else {
				System.out.println("Error: The option you have inputted has no meaning. Please try again.");
			}
		}
		
		else if (optionVehicle == 3) {
			System.out.println("List of options:");
			System.out.println("1. Vehicle Name and Year");
			System.out.println("2. Fuel Economy");
			System.out.println("3. Seating and Cargo Volume");
			System.out.println("4. Price");
			System.out.print("Which option would you like to choose?: ");
			optionChoice = input.nextInt();
			
			// Display chosen vehicle details based on user input
			if (optionChoice == 1) {
				System.out.println(vehicle3.getYear() + " " + vehicle3.getMake() + " " + vehicle3.getModel());
			}
			else if (optionChoice == 2) {
				System.out.println("Fuel Economy: " + vehicle3.getFuelEconomyCity() + " L/100 kilometers city and " + vehicle3.getFuelEconomyHwy() + " L/100 kilometers highway");
			}
			else if (optionChoice == 3) {
				System.out.println("Seating Capacity: " + vehicle3.getSeatingCapacity() + " | Cargo Volume: " + vehicle3.getCargoVolume() + " cubic feet");
			}
			else if (optionChoice == 4) {
				System.out.println("MSRP: " + price.format(vehicle3.getMSRP()));
			}
			else {
				System.out.println("Error: The option you have inputted has no meaning. Please try again.");
			}
		}
		else {
			System.out.println("Error: The option you have inputted has no meaning. Please try again.");
		}

		
		// Close the input scanner
		input.close();
	}
}

/* Screen Dump
Case 1:
	1. Vehicle 1
	2. Vehicle 2
	3. Vehicle 3
	Which mystery vehicle would you like to choose?: 1
	List of options:
	1. Vehicle Name and Year
	2. Fuel Economy
	3. Seating and Cargo Volume
	4. Price
	Which option would you like to choose?: 1
	2023 Toyota Camry

Case 2:
	1. Vehicle 1
	2. Vehicle 2
	3. Vehicle 3
	Which mystery vehicle would you like to choose?: 2
	List of options:
	1. Vehicle Name and Year
	2. Fuel Economy
	3. Seating and Cargo Volume
	4. Price
	Which option would you like to choose?: 4
	MSRP: $55,000.00

*/
