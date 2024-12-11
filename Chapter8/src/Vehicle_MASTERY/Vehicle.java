package Vehicle_MASTERY;

public abstract class Vehicle {
	// Private attributes of the Vehicle class
	private String make;  // Vehicle make (e.g., Toyota)
	private String model; // Vehicle model (e.g., Camry)
	private int year;     // Vehicle manufacturing year
	private double MSRP;  // Manufacturer's Suggested Retail Price
	
	// Constructor to initialize a vehicle object with its attributes
	public Vehicle(String ma, String mo, int y, double P) {
		make = ma;
		model = mo;
		year = y;
		MSRP = P;
	}
	
	// Getter method for the vehicle make
	public String getMake() {
		return make;
	}
	
	// Getter method for the vehicle model
	public String getModel() {
		return model;
	}
	
	// Getter method for the vehicle manufacturing year
	public int getYear() {
		return year;
	}
	
	// Getter method for the vehicle MSRP
	public double getMSRP() {
		return MSRP;
	}
	
	// Setter method for the vehicle make
	public void setMake(String ma) {
		make = ma;
	}
	
	// Setter method for the vehicle model
	public void setModel(String mo) {
		model = mo;
	}
	
	// Setter method for the vehicle manufacturing year
	public void setYear(int y) {
		year = y;
	}
	
	// Setter method for the vehicle MSRP
	public void setMSRP(double P) {
		MSRP = P;
	}
	
	// Method to return a string representation of the vehicle
	public String toString() {
		return("Year: " + year + " | " + "Make: " + make + " | " + "Model: " + model + " | " + "MSRP: $" + MSRP);
	}
}
