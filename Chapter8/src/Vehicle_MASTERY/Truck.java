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

}
