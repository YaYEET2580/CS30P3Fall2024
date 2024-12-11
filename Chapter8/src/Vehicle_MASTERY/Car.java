package Vehicle_MASTERY;

public class Car extends Vehicle {
	// Additional attributes specific to a Car
   private double fuelEconomyCity;  // Fuel economy in city (L/100km)
   private double fuelEconomyHwy;   // Fuel economy on highway (L/100km)
   private int seatingCapacity;     // Number of seats in the car
   private double cargoVolume;      // Cargo volume (cubic feet)
  
   // Constructor to initialize the Car object with vehicle and car-specific details
   public Car(String ma, String mo, int y, double P, double city, double hwy, int seating, double cargo) {
		super(ma, mo, y, P);  // Call the parent class constructor
	   	fuelEconomyCity = city;
	   	fuelEconomyHwy = hwy;
	   	seatingCapacity = seating;
	   	cargoVolume = cargo;
   }
  
   // Getter methods for Car-specific attributes
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
  
   // Setter methods for Car-specific attributes
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
  
   // Override toString() method to include car-specific information
   public String toString() {
		return("Year: " + super.getYear() + " | " + "Make: " + super.getMake() + " | " + "Model: " + super.getModel() + " | " + "Fuel economy city/hwy: " + fuelEconomyCity + "/" + fuelEconomyHwy + " L/100km" + " | " + "Seating Capacity: " + seatingCapacity + " | " + "Cargo Volume: " + cargoVolume);
	}
}
