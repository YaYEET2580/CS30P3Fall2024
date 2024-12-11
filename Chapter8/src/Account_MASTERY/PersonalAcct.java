package Account_MASTERY;

import java.text.*; // Import for formatting currency

// Class representing a personal account which extends the Account class
public class PersonalAcct extends Account {
	// Minimum balance required for personal account
	public double minBal = 100.00;
	// Fee applied if balance falls below minimum
	public double fee = 2.00;
	// Currency format for displaying money
	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	// Constructor to initialize personal account with balance and customer details
	public PersonalAcct(double bal, String fName, String lName, String st, String c, String pro, String post) {
		// Call the superclass (Account) constructor to initialize common fields
		super(bal, fName, lName, st, c, pro, post);
	}
	
	// Constructor to initialize personal account using account ID
	public PersonalAcct(String ID) {
		super(ID); // Call the superclass constructor to initialize with account ID
	}
	
	// Method to handle withdrawals from the personal account
	public void withdrawal(double amt) {
		super.withdrawal(amt); // Call the superclass method to process the withdrawal
		System.out.println(money.format(amt) + " successfully withdrawed!"); // Print success message with formatted amount
		
		// Check if the balance falls below the minimum balance
		if (getBalance() < minBal) {
			super.withdrawal(fee); // Apply the fee if balance is below the minimum
			System.out.println("Balance below minimum. $2.00 fee applied."); // Inform the user about the fee
		}
	}
}
