package Vehicle_MASTERY;

public class Minivan extends Vehicle {
	// Similar attributes as Car but for Minivan
	private double fuelEconomyCity;
   	private double fuelEconomyHwy;
   	private int seatingCapacity;
   	private double cargoVolume;
  
   // Constructor to initialize the Minivan object with vehicle and minivan-specific details
   public Minivan(String ma, String mo, int y, double P, double city, double hwy, int seating, double cargo) {
   	super(ma, mo, y, P);  // Call the parent class constructor
   	fuelEconomyCity = city;
   	fuelEconomyHwy = hwy;
   	seatingCapacity = seating;
   	cargoVolume = cargo;
   }
  
   // Getter methods for Minivan-specific attributes
   public double getFuelEconomyCity() {
   	return fuelEconomyCity;
   }
  
   public double getFuelEconomyHwy() {
   	return fuelEconomyHwy;
   }
  
   public double getSeatingCapacity() {
   	return seatingCapacity;
   }
  
   public double getCargoVolume() {
   	return cargoVolume;
   }
  
   // Setter methods for Minivan-specific attributes
   public void setFuelEconomyCity(double city) {
   	fuelEconomyCity = city;
	}
   
   public void setFuelEconomyHwy(double hwy) {
   	fuelEconomyHwy = hwy;
	}
   
   public void setSeatingCapacity(int seating) {
   	seatingCapacity = seating;
	}
   
   public void setCargoVolume(double cargo) {
   	cargoVolume = cargo;
	}
  
   // Override toString() method to include minivan-specific information
   public String toString() {
		return("Year: " + super.getYear() + " | " + "Make: " + super.getMake() + " | " + "Model: " + super.getModel() + " | " + "Fuel economy city/hwy: " + fuelEconomyCity + "/" + fuelEconomyHwy + " L/100km" + " | " + "Seating Capacity: " + seatingCapacity + " | " + "Cargo Volume: " + cargoVolume);
	}
}
