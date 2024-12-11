/*

Program: ????.java          Last Date of this Revision: December 11, 2024

Purpose: A client code application that uses a Faculty and Staff class that inherit the UEmployee class.
The UEmployee class returns university employee name and salary. Faculty class should include
members for storing and returning the department name. The Staff class should include members for
storing and returning the job title.

Author: Sakibul Majid 
School: CHHS
Course: Computer Programming 30
 

*/


package UEmployee_MASTERY;

import java.text.*; // Import for formatting currency
import java.util.*; // Import for using the Scanner class

public class testUEmployee {
	// Main method to test the functionality of Faculty and Staff classes
	public static void main(String[] args) {
		// Create a staff member and a faculty member with initial details
		Staff universityStaffMember1 = new Staff("John", "Smith", 85174.00, "Professor");
		Faculty universityFacultyMember1 = new Faculty("Jane", "Doe", 95000.00, "Computer Science");
		
		// Scanner object to read user input
		Scanner input = new Scanner(System.in);
		// NumberFormat object to format the salary as currency
		NumberFormat paycheck = NumberFormat.getCurrencyInstance();
		
		// Variables to store user's choice for employee and option
		int optionMember;
		int optionChoice;
		
		// Print the list of university employees
		System.out.println("University employees:");
		System.out.println("1. " + universityStaffMember1.getFirstName() + " " + universityStaffMember1.getLastName());
		System.out.println("2. " + universityFacultyMember1.getFirstName() + " " + universityFacultyMember1.getLastName());
		
		// Ask user which employee they want to see information for
		System.out.print("Which University employee would you like to see their info?: ");
		optionMember = input.nextInt();
		
		// If user chooses the staff member
		if (optionMember == 1) {
			// Print list of options for staff member
			System.out.println("List of options:");
			System.out.println("1. Name");
			System.out.println("2. Salary");
			System.out.println("3. Title");
			System.out.print("Which option would you like to choose?: ");
			optionChoice = input.nextInt();
			
			// Display selected information about the staff member
			if (optionChoice == 1) {
				System.out.println(universityStaffMember1.getFirstName() + " " + universityStaffMember1.getLastName());
			}
			else if (optionChoice == 2) {
				System.out.println("Salary: " + paycheck.format(universityStaffMember1.getSalary()));
			}
			else if (optionChoice == 3) {
				System.out.println("Title: " + universityStaffMember1.getTitle());
			}
			else {
				// Handle invalid choice
				System.out.println("Error: The option you have inputted has no meaning. Please try again.");
			}
		}
		// If user chooses the faculty member
		else if (optionMember == 2) {
			// Print list of options for faculty member
			System.out.println("List of options:");
			System.out.println("1. Name");
			System.out.println("2. Salary");
			System.out.println("3. Department");
			System.out.print("Which option would you like to choose?: ");
			optionChoice = input.nextInt();
			
			// Display selected information about the faculty member
			if (optionChoice == 1) {
				System.out.println(universityFacultyMember1.getFirstName() + " " + universityFacultyMember1.getLastName());
			}
			else if (optionChoice == 2) {
				System.out.println("Salary: " + paycheck.format(universityFacultyMember1.getSalary()));
			}
			else if (optionChoice == 3) {
				System.out.println("Department: " + universityFacultyMember1.getDepartment());
			}
			else {
				// Handle invalid choice
				System.out.println("Error: The option you have inputted has no meaning. Please try again.");
			}
		}
		else {
			// Handle invalid employee choice
			System.out.println("Error: The option you have inputted has no meaning. Please try again.");
		}
		
		// Close the scanner object
		input.close();
	}
}

/* Screen Dump
Case 1:
	University employees:
	1. John Smith
	2. Jane Doe
	Which University employee would you like to see their info?: 1
	List of options:
	1. Name
	2. Salary
	3. Title
	Which option would you like to choose?: 3
	Title: Professor

Case 2:
	University employees:
	1. John Smith
	2. Jane Doe
	Which University employee would you like to see their info?: 2
	List of options:
	1. Name
	2. Salary
	3. Department
	Which option would you like to choose?: 3
	Department: Computer Science

 */
