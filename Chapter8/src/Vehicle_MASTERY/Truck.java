package Vehicle_MASTERY;
public class Truck extends Vehicle {
	private double fuelEconomyCity;
   private double fuelEconomyHwy;
   private int seatingCapacity;
   private double cargoVolume;
  
   public Truck(String ma, String mo, int y, double P, double city, double hwy, int seating, double cargo) {
   	super(ma, mo, y, P);
   	fuelEconomyCity = city;
   	fuelEconomyHwy = hwy;
   	seatingCapacity = seating;
   	cargoVolume = cargo;
   }
  
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
  
   public String toString() {
		return("Year: " + super.getYear() + " | " + "Make: " + super.getMake() + " | " + "Model: " + super.getModel() + " | " + "Fuel economy city/hwy: " + fuelEconomyCity + "/" + fuelEconomyHwy + " L/100km" + " | " + "Seating Capacity: " + seatingCapacity + " | " + "Cargo Volume: " + cargoVolume);
	}
}
