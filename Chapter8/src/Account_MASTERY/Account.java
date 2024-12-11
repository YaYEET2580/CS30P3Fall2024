package Account_MASTERY;
import java.text.*; // Import for formatting currency

// Abstract class representing a bank account
public abstract class Account {
	// Private member variables to store account balance, customer info, and account ID
	private double balance;
	private Customer cust;
	private String acctID;
	
	// Constructor to initialize account with balance and customer details
	public Account(double bal, String fName, String lName, String st, String c, String pro, String post) {
		balance = bal;  // Set the initial balance
		// Initialize the customer object with provided details
		cust = new Customer(fName, lName, st, c, pro, post);
		// Generate a unique account ID based on the customer's first and last names
		acctID = fName.substring(0,1) + lName;
	}
	
	// Constructor to initialize account with just an account ID, default balance is 0
	public Account(String ID) {
		balance = 0;  // Default balance is 0
		// Create a customer object with empty details
		cust = new Customer("", "", "", "", "", "");
		acctID = ID;  // Set the account ID
	}
	
	// Getter method for the account ID
	public String getID() {
	 	return(acctID);
	}
	
	// Getter method for the account balance
	public double getBalance() {
	 	return(balance);
	}
	
	// Method to deposit an amount into the account
	public void deposit(double amt) {
	 	balance += amt;  // Add the deposit amount to the balance
	}
	
	// Method to withdraw an amount from the account
	public void withdrawal(double amt) {
	 	// Check if there is enough balance to withdraw
	 	if (amt <= balance) {
	 		balance -= amt;  // Subtract the withdrawal amount from the balance
	 	} else {
	 		// If not enough balance, print an error message
	 		System.out.println("Not enough money in account.");
	 	}
	}
	
	// Override the equals method to compare two accounts based on their account ID
	public boolean equals(Object acct) {
		// Cast the object to an Account type for comparison
		Account testAcct = (Account)acct;
		// Compare account IDs for equality
		if (acctID.equals(testAcct.acctID)) {
				return(true);  // Accounts are equal if IDs match
			} else {
				return(false);  // Accounts are not equal if IDs don't match
			}
	}
	
	// Method to change the customer's address information
	public void changeAddress(String st, String c, String pro, String post) {
		// Update the customer's address details
		cust.changeStreet(st);
		cust.changeCity(c);
		cust.changeProvince(pro);
		cust.changePostalCode(post);
	}
	
	// Override the toString method to provide a string representation of the account
	public String toString() {
		String accountString;
		// Use NumberFormat to format the balance as currency
		NumberFormat money = NumberFormat.getCurrencyInstance();
		// Build the account's string representation
		accountString = acctID + "\n";  // Include account ID
		accountString += cust.toString();  // Include customer details
		accountString += "Current balance is " + money.format(balance);  // Format and display balance
	 	return(accountString);
	}
}
