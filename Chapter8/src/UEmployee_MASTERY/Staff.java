package UEmployee_MASTERY;

// Class representing a staff member, which extends the UEmployee class
public class Staff extends UEmployee {
	// Private member variable for storing the title of the staff member
	private String title;
	
	// Constructor to initialize staff details including title
	public Staff(String fName, String lName, double sal, String t) {
		super(fName, lName, sal); // Call the superclass constructor to initialize common fields
		title = t; // Initialize title
	}
	
	// Getter method for title
	public String getTitle() {
		return title; // Return the title of the staff member
	}
	
	// Setter method for title
	public void setTitle(String t) {
		title = t; // Set the title of the staff member
	}
	
	// Method to return the staff member's details as a formatted string
	public String toString() {
		return(super.getFirstName() + super.getLastName() + super.getSalary() + title); // Return concatenated details of the staff member
	}
}
