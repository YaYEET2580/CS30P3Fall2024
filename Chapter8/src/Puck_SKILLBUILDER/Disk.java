package Puck_SKILLBUILDER;

public class Disk extends Circle
{
	private double thickness;
	
	
	public Disk(double radius, double thick) 
	{
		super(radius);
		thickness = thick;
	}
	
	public void setThickness(double newThickness) 
	{
	 	thickness = newThickness;
	}
	
	public double getThickness() 
	{
	 	return(thickness);
	}
	
	public double volume() 
	{
		double volume;
		
		volume = super.area() * thickness;
		return(volume);
	}
	
	public boolean equals(Object object) 
	{
		Disk testObject = (Disk)object;
		
	 	if (testObject.getRadius() == super.getRadius() && 
	 			testObject.getThickness() == thickness) {
			return(true);
		} else {
			return(false);
		}
	}
	
	public String toString() 
	{
		String diskString;

		diskString = "The disk has radius " + super.getRadius() + " and thickness " + thickness + ".";
	 	return(diskString);
	}

}