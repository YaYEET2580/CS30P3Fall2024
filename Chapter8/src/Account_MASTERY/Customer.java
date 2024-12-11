package Account_MASTERY;
import java.util.*; // Import for using Scanner class to take user input

// Class representing a customer with personal and address details
public class Customer {
	// Private member variables to store customer details
	private String firstName, lastName, street, city, province, postalCode;
	
	// Scanner object to take user input
	Scanner input = new Scanner(System.in);
	
	// Constructor to initialize customer with personal and address details
	public Customer(String fName, String lName, String st, String c, String pro, String post) {
		// Set customer details based on constructor parameters
		firstName = fName;
		lastName = lName;
		street = st;
		city = c;
		province = pro;
		postalCode = post;
	}
	
	// Method to change the street address of the customer
	public void changeStreet(String st) {
		// Prompt the user for a new street address
		System.out.print("What is your new street?: ");
		st = input.next();  // Take input from user
		street = st;  // Update the street address
	}
	
	// Method to change the city of the customer
	public void changeCity(String c) {
		// Prompt the user for a new city
		System.out.print("What is your new street?: ");
		c = input.next();  // Take input from user
		city = c;  // Update the city
	}
	
	// Method to change the province of the customer
	public void changeProvince(String pro) {
		// Prompt the user for a new province
		System.out.print("What is your new street?: ");
		pro = input.next();  // Take input from user
		province = pro;  // Update the province
	}
	
	// Method to change the postal code of the customer
	public void changePostalCode(String post) {
		// Prompt the user for a new postal code
		System.out.print("What is your new street?: ");
		post = input.next();  // Take input from user
		postalCode = post;  // Update the postal code
	}
	
	// Override toString method to provide a string representation of the customer's details
	public String toString() {
		// Build a string containing all the customer information
		String custString;
		custString = firstName + " " + lastName + "\n" + street + "\n" + city + ", " + province + " " + postalCode + "\n";
		return(custString);  // Return the formatted customer information string
	}
}
