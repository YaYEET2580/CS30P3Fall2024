package Vehicle_MASTERY;

public abstract class Vehicle {
	private String make;
	private String model;
	private int year;
	private double MSRP;
	
	public Vehicle(String ma, String mo, int y, double P) {
		make = ma;
		model = mo;
		year = y;
		MSRP = P;
	}
	
	public String toString() {
		return("Year: " + year + " | " + "Make: " + make + " | " + "Model: " + model + " | " + "MSRP: $" + MSRP);
	}

}
