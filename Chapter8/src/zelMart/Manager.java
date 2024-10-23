package zelMart;

public class Manager extends Employee {
	
	private double yearlySalary;
	
	public Manager(String fName, String lName, double salary) {
		super(fName, lName);
		yearlySalary = salary;
	}
	
	public double getYearlySalary() {
		return yearlySalary;
	}
	
	public double pay(double weeks) {
		double payEarned;
		
		payEarned = yearlySalary / 52 * weeks;
		return payEarned;
	}
	
	public String toString() {
		return(super.toString() + ", Manager" + " Salary: " + yearlySalary);
	}

}
