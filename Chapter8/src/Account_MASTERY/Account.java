
package Account_MASTERY;
import java.text.*;
public abstract class Account {
	private double balance;
	private Customer cust;
	private String acctID;
	
	public Account(double bal, String fName, String lName, String st, String c, String pro, String post) {
		balance = bal;
		cust = new Customer(fName, lName, st, c, pro, post);
		acctID = fName.substring(0,1) + lName;
	}
	
	public Account(String ID) {
		balance = 0;
		cust = new Customer("", "", "", "", "", "");
		acctID = ID;
	}
	
	public String getID() {
	 	return(acctID);
	}
	
	public double getBalance() {
	 	return(balance);
	}
	
	public void deposit(double amt) {
	 	balance += amt;
	}
	
	public void withdrawal(double amt) {
	 	if (amt <= balance) {
	 		balance -= amt;
	 	} else {
	 		System.out.println("Not enough money in account.");
	 	}
	}
	
	public boolean equals(Object acct) {
		Account testAcct = (Account)acct;
		if (acctID.equals(testAcct.acctID)) {
				return(true);
			} else {
				return(false);
			}
	}
	
	public void changeAddress(String st, String c, String pro, String post) {
		cust.changeStreet(st);
		cust.changeCity(c);
		cust.changeProvince(pro);
		cust.changePostalCode(post);
	}
	
	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		accountString = acctID + "\n";
		accountString += cust.toString();
		accountString += "Current balance is " + money.format(balance);
	 	return(accountString);
	}
}
