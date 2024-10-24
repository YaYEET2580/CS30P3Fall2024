package Puck_SKILLBUILDER;

public class Puck extends Disk
{
	public double minimumStandardWeight = 5;
	public double maximumStandardWeight = 5.5;
	public double minimumYouthWeight = 4;
	public double maximumYouthWeight = 4.5;
	private double weight;
	private boolean standard, youth;
	
	public Puck(double w)
	{
		super(1.5, 1);
		weight = w;
		
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
		return div;
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

}