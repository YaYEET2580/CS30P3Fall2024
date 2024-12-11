package UEmployee_MASTERY;

// Abstract class representing a generic employee with basic details
public abstract class UEmployee {
	// Private member variables for storing employee details
	private String firstName, lastName;
	private double salary;
	
	// Constructor to initialize employee details
	public UEmployee(String fName, String lName, double sal) {
		firstName = fName; // Initialize first name
		lastName = lName;  // Initialize last name
		salary = sal;      // Initialize salary
	}
	
	// Getter method for first name
	public String getFirstName() {
		return firstName; // Return the first name of the employee
	}
	
	// Getter method for last name
	public String getLastName() {
		return lastName; // Return the last name of the employee
	}
	
	// Getter method for salary
	public double getSalary() {
		return salary; // Return the salary of the employee
	}
	
	// Setter method for first name
	public void setFirstName(String fName) {
		firstName = fName; // Set the first name of the employee
	}
	
	// Setter method for last name
	public void setLastName(String lName) {
		lastName = lName; // Set the last name of the employee
	}
	
	// Setter method for salary
	public void setSalary(double sal) {
		salary = sal; // Set the salary of the employee
	}
	
	// Method to return the employee's details as a formatted string
	public String toString() {
		return("First Name: " + firstName + " Last Name: " + lastName + " Salary: " + salary);
	}
}
