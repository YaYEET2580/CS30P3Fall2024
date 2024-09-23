package LocalBank;

import java.text.NumberFormat;

public class Account {
	 public double balance;
	 public Customer customer;
	 public String accountID;
	 
	 public Account(double bal, String fName, String lName) {
		 balance = bal;
		 customer = new Customer(fName, lName);
		 accountID = fName.substring(0,1) + lName;
	 }
	 
	 public Account(String ID) {
		 balance = 0;
		 customer = new Customer("", "");
		 accountID = ID;
	 }
	 
	 public String getID() {
		 return(accountID);
	 }
	 
	 public double getBalance() {
		 return(balance);
	 }
	 
	 public void deposit(double amt) {
		 balance += amt;
	 }
	 
	 public String withdrawal(double amt) {
		 if (amt <= balance) {
			 balance -= amt;
		 } 
		 return("Not enough money in account.");
	}
	 
	 public boolean equals(Object acct) {
		 Account testAcct = (Account)acct;
		 if (accountID.equals(testAcct.accountID)) {
			 return(true);
		 } 
		 else {
			 return(false);
		 }
	 }
	 
	 public String toString() {
		 String accountString;
		 NumberFormat money = NumberFormat.getCurrencyInstance();
		 
		 accountString = accountID + "\n";
		 accountString += customer.toString();
		 accountString += "Current balance is " + money.format(balance);
		 return(accountString);

	 }
	 

}
