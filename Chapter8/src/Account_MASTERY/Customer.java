package Account_MASTERY;
import java.util.*;
public class Customer {
	private String firstName, lastName, street, city, province, postalCode;
	Scanner input = new Scanner(System.in);
	
	public Customer(String fName, String lName, String st, String c, String pro, String post) {
		firstName = fName;
		lastName = lName;
		street = st;
		city = c;
		province = pro;
		postalCode = post;
	}
	
	public void changeStreet(String st) {
		System.out.print("What is your new street?: ");
		st = input.next();
		street = st;
	}
	
	public void changeCity(String c) {
		System.out.print("What is your new street?: ");
		c = input.next();
		city = c;
	}
	
	public void changeProvince(String pro) {
		System.out.print("What is your new street?: ");
		pro = input.next();
		province = pro;
	}
	
	public void changePostalCode(String post) {
		System.out.print("What is your new street?: ");
		post = input.next();
		postalCode = post;
	}
	
	public String toString() {
		String custString;
		custString = firstName + " " + lastName + "\n" + street + "\n" + city + ", " + province + " " + postalCode + "\n";
	 	return(custString);
	}
}
