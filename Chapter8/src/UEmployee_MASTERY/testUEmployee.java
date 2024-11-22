package UEmployee_MASTERY;

import java.util.*;

public class testUEmployee {

	public static void main(String[] args) {
		Staff universityStaffMember1 = new Staff("John", "Smith", 85174.00, "Professor");
		Faculty universityFacultyMember1 = new Faculty("Jane", "Doe", 95000.00, "Computer Science");
		Scanner input = new Scanner(System.in);
		int optionMember;
		int optionChoice;
		
		System.out.println("University employees:");
		System.out.println("1. " + universityStaffMember1.getFirstName() + " " + universityStaffMember1.getLastName());
		System.out.println("2. " + universityFacultyMember1.getFirstName() + " " + universityFacultyMember1.getLastName());
		System.out.print("Which Univeristy employee would you like to see their info?: ");
		optionMember = input.nextInt();
		
		
		
		
		

	}

}
