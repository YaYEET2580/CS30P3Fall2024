package zelMart;

public abstract class Employee {
	private String firstName, lastName;
	
	//Constructor
	public Employee(String fName, String lName) {
		firstName = fName;
		lastName = lName;
		
	}
	
	public String toString() {
		return(firstName + " " + lastName);
	}
	
	abstract double pay(double period);

}
