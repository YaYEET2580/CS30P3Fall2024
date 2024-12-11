package UEmployee_MASTERY;

// Class representing a faculty member, which extends the UEmployee class
public class Faculty extends UEmployee {
	// Private member variable for storing the department of the faculty
	private String department;
	
	// Constructor to initialize faculty details including department
	public Faculty(String fName, String lName, double sal, String d) {
		super(fName, lName, sal); // Call the superclass constructor to initialize common fields
		department = d; // Initialize department
	}
	
	// Getter method for department
	public String getDepartment() {
		return department; // Return the department of the faculty member
	}
	
	// Setter method for department
	public void setDepartment(String d) {
		department = d; // Set the department of the faculty member
	}
	
	// Method to return the faculty member's details as a formatted string
	public String toString() {
		return(super.getFirstName() + super.getLastName() + super.getSalary() + department); // Return concatenated details of the faculty member
	}
}
