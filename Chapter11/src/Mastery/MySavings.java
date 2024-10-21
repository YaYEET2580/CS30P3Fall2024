/*

Program: MySavings.java          Last Date of this Revision: October 21, 2024

Purpose: A modified application that store and load the PiggyBank object
from a file.

Author: Sakibul Majid 
School: CHHS
Course: Computer Programming 30
 

*/

package Mastery;

// Import input tool and necessary IO classes for file handling
import java.util.Scanner;
import java.io.*;

public class MySavings {

	public static void main(String[] args) {
		// Declare variables
		int choice;  // To store the user's choice from the menu
		ObjectInputStream instream;  // For reading an object from a file
		ObjectOutputStream outstream;  // For writing an object to a file
		
		// Create an instance of PiggyBank to manage savings
		PiggyBank mySavings = new PiggyBank();
		
		// Check if the PiggyBank instance exists (or not null)
		if (mySavings != null) {
			try {
				// Attempt to load previously saved PiggyBank data from the file "PiggyBank.dat"
				instream = new ObjectInputStream(new FileInputStream("PiggyBank.dat"));
				mySavings = (PiggyBank) instream.readObject();  // Read the object from file and cast it to PiggyBank
			}
			catch (IOException e) {
				// Handle IOExceptions (file not found, etc.)
				System.out.println("Problem reading file.");
				System.err.println("IOException: " + e.getMessage());
			}
			catch (ClassNotFoundException e) {
				// Handle case where the PiggyBank class cannot be found
				System.out.println("Problem reading file.");
				System.err.println("ClassNotFoundException: " + e.getMessage());
			}
		}
		
		// Set up input stream to accept user input
		Scanner input = new Scanner(System.in);
		
		// Display a welcome message to the user
		System.out.println("Welcome to the MySavings application!");
		
		// Start a loop to repeatedly show menu options and take user actions
		while (true) {
			// Print a list of available options for the user
			System.out.println();
			System.out.println("1. Add a penny");
			System.out.println("2. Add a nickel");
			System.out.println("3. Add a dime");
			System.out.println("4. Add a quarter");
			System.out.println("5. Withdraw money");
			System.out.println("6. Show total in bank");
			System.out.println("7. Save PiggyBank");
			System.out.println("0. Quit this application");
			
			// Prompt the user for their choice of action
			System.out.print("Please enter your choice: ");
			choice = input.nextInt();  // Store the user's input choice
			System.out.println();
			
			// Execute actions based on the user's choice
			if (choice == 1) {
				// Call method to add a penny to the savings
				mySavings.AddPenny();
			}
			else if (choice == 2) {
				// Call method to add a nickel to the savings
				mySavings.AddNickel();
			}
			else if (choice == 3) {
				// Call method to add a dime to the savings
				mySavings.AddDime();
			}
			else if (choice == 4) {
				// Call method to add a quarter to the savings
				mySavings.AddQuarter();
			}
			else if (choice == 5) {
				// Call method to withdraw money from the savings
				mySavings.WithdrawAmount();
			}
			else if (choice == 6) {
				// Call method to display the total amount in the PiggyBank
				PiggyBank.dollarAmount();
			}
			else if (choice == 7) {
				// Save the current state of the PiggyBank to a file
				try {
					outstream = new ObjectOutputStream(new FileOutputStream("PiggyBank.dat"));
					outstream.writeObject(mySavings);  // Write the PiggyBank object to file
					System.out.println("PiggyBank has been saved successfully.");
					outstream.close();  // Close the output stream
				}
				catch (FileNotFoundException e) {
					// Handle case where the file cannot be found or created
					System.out.println("File does not exist or could not be found.");
					System.err.println("FileNotFoundException: " + e.getMessage());
				}
				catch (IOException e) {
					// Handle IO exceptions while saving the file
					System.out.println("Problem reading file.");
					System.err.println("IOException: " + e.getMessage());
				}
			}
			else {
				// If the user enters 0, close the input stream and exit the application
				input.close();  // Close the scanner to avoid resource leakage
				break;  // Exit the loop and end the application
			}
		}
	}
}
/* Screen Dump

Case 1:
 
 */
