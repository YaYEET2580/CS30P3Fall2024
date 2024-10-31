package Puck_SKILLBUILDER;


public class Puck extends Disk implements Comparable

{
	public double minimumStandardWeight = 5;
	public double maximumStandardWeight = 5.5;
	public double minimumYouthWeight = 4;
	public double maximumYouthWeight = 4.5;
	private double weight;
	private boolean standard, youth;
	
	public Puck()
	{
		super(1.5, 1);
		
		if(weight >= minimumStandardWeight && weight <= maximumStandardWeight)
		{
			standard = true;
			youth = false;
		}
		else
		{
			standard = false;
			youth = true;
		}
	}
	
	public double getWeight() 
	{
	 	return(weight);
	}
	
	public void setWeight(double w) {
		weight = w;
	}
	
	public String getDivision()
	{
		String div;
		
		if(standard)
		{
			div = "Puck is standard";
		}
		else
		{
			div = "Puck is youth";
		}
		return(div);
	}
	
	public  boolean equals(Object obj)
	{
		Puck testObj = (Puck)obj;
		
		if(testObj.getDivision() == getDivision())
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	public String toString() {
		String puckString;
		
		puckString = "The puck has a weight of " + getWeight() + " and division is " + getDivision() + ".";
		
		return(puckString);
	}

}