package UEmployee_MASTERY;

public class Faculty extends UEmployee {
	private String department;
	
	public Faculty(String fName, String lName, double sal, String d) {
		super(fName, lName, sal);
		department = d;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public void setDepartment(String d)
	{
		department = d;
	}
	
	public String toString()
	{
		return(super.getFirstName() + super.getLastName() + super.getSalary() + department);
	}
	
	

}
