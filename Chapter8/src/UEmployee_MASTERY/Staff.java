package UEmployee_MASTERY;

public class Staff extends UEmployee
{
	private String title;
	
	public Staff(String fName, String lName, double sal, String t)
	{
		super(fName, lName, sal);
		title = t;
	}
	
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String t)
	{
		title = t;
	}
	
	public String toString()
	{
		return(super.getFirstName() + super.getLastName() + super.getSalary() + title);
	}
	
}