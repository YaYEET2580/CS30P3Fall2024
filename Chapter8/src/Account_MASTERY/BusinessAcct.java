package Account_MASTERY;

import java.text.*; // Import for formatting currency

// Class representing a business account which extends the Account class
public class BusinessAcct extends Account {
	// Minimum balance required for business account
	public double minBal = 500.00;
	// Fee applied if balance falls below minimum
	public double fee = 10.00;
	// Currency format for displaying money
	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	// Constructor to initialize business account with balance and customer details
	public BusinessAcct(double bal, String fName, String lName, String st, String c, String pro, String post) {
		// Call the superclass (Account) constructor to initialize common fields
		super(bal, fName, lName, st, c, pro, post);
	}
	
	// Constructor to initialize business account using account ID
	public BusinessAcct(String ID) {
		super(ID); // Call the superclass constructor to initialize with account ID
	}
	
	// Method to handle withdrawals from the business account
	public void withdrawal(double amt) {
		super.withdrawal(amt); // Call the superclass method to process the withdrawal
		System.out.println(money.format(amt) + " successfully withdrawed!"); // Print success message with formatted amount
		
		// Check if the balance falls below the minimum balance
		if (getBalance() < minBal) {
			super.withdrawal(fee); // Apply the fee if balance is below the minimum
			System.out.println("Balance below minimum. $10.00 fee applied."); // Inform the user about the fee
		}
	}
}
