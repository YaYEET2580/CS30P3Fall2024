package LocalBank;

public class Customer {
	 public String firstName, lastName;
	 
	 public Customer(String fName, String lName) {
		 firstName = fName;
		 lastName = lName;
	 }
	 
	 public String toString() {
		 String custString;
		 custString = firstName + " " + lastName + "\n";
		 return(custString);
	 }




}
