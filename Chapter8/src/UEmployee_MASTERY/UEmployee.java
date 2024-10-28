package UEmployee_MASTERY;

public abstract class UEmployee 
{
	private String firstName, lastName;
	private double salary;
	
	public UEmployee(String fName, String lName, double sal)
	{
		firstName = fName;
		lastName = lName;
		salary = sal;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setFirstName(String fName)
	{
		firstName = fName;
	}
	public void setLastName(String lName)
	{
		lastName = lName;
	}
	public void setSalary(double sal)
	{
		salary = sal;
	}
	
	public String toString()
	{
		return("First Name: "+ firstName + " Last Name: " + lastName + " Salary: " + salary );
	}
	
	
	

}