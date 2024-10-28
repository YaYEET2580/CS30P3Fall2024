package zelMart_DEMO;

public class Associate extends Employee
{
	
	private double hourlyPayRate;
	
	public Associate(String fName, String lName, double rate) 
	{
		super(fName, lName);
		hourlyPayRate = rate;
	}
	
	public double pay(double hours) 
	{
		double payEarned;
		
		if (hours > 40) 
		{
			payEarned = ((hourlyPayRate * 40) + (hourlyPayRate * 1.5) * (hours - 40));
		}
		else 
		{
			payEarned = hours * hourlyPayRate;
		}
		
		return payEarned;
		
	}
	
	public String toString() 
	{
		return(super.toString() + ", Associate" + " Pay Rate: " + hourlyPayRate);
	}

}
