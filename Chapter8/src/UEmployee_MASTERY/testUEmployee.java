package UEmployee_MASTERY;

import java.text.*;
import java.util.*;

public class testUEmployee {

	public static void main(String[] args) {
		Staff universityStaffMember1 = new Staff("John", "Smith", 85174.00, "Professor");
		Faculty universityFacultyMember1 = new Faculty("Jane", "Doe", 95000.00, "Computer Science");
		Scanner input = new Scanner(System.in);
		NumberFormat paycheck = NumberFormat.getCurrencyInstance();
		int optionMember;
		int optionChoice;
		
		System.out.println("University employees:");
		System.out.println("1. " + universityStaffMember1.getFirstName() + " " + universityStaffMember1.getLastName());
		System.out.println("2. " + universityFacultyMember1.getFirstName() + " " + universityFacultyMember1.getLastName());
		System.out.print("Which Univeristy employee would you like to see their info?: ");
		optionMember = input.nextInt();
		
		if (optionMember == 1) {
			System.out.println("List of options:");
			System.out.println("1. Name");
			System.out.println("2. Salary");
			System.out.println("3. Title");
			System.out.print("Which option would you like to choose?: ");
			optionChoice = input.nextInt();
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
				System.out.println("Error: The option you have inputted has no meaning. Please try again.");
			}
		}
		else if (optionMember == 2) {
			System.out.println("List of options:");
			System.out.println("1. Name");
			System.out.println("2. Salary");
			System.out.println("3. Department");
			System.out.print("Which option would you like to choose?: ");
			optionChoice = input.nextInt();
			if (optionChoice == 1) {
				System.out.println(universityFacultyMember1.getFirstName() + " " + universityFacultyMember1.getLastName());
			}
			else if (optionChoice == 2) {
				System.out.println("Salary: " + paycheck.format(universityFacultyMember1.getSalary()));
			}
			else if (optionChoice == 3) {
				System.out.println("Title: " + universityFacultyMember1.getDepartment());
			}
			else {
				System.out.println("Error: The option you have inputted has no meaning. Please try again.");
			}
		}
		else {
			System.out.println("Error: The option you have inputted has no meaning. Please try again.");
		}
		input.close();
		
		
		
		
		

	}

}
