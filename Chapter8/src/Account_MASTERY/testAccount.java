/*

Program: ????.java          Last Date of this Revision: December 11, 2024

Purpose: A client code application that uses both PersonalAcct and BusinessAcct classes that inherit the Account class presented in Chapter 8.
A personal account requires a minimum balance of $100. If the balance falls below this amount, then
$2.00 is charged (withdrawn) to the account. A business account requires a minimum balance of $500,
otherwise the account is charged $10.

Author: Sakibul Majid 
School: CHHS
Course: Computer Programming 30
 

*/


package Account_MASTERY;

public class testAccount {
	// Main method to test the functionality of PersonalAcct and BusinessAcct classes
	public static void main(String[] args) {
		// Create a new PersonalAcct object with initial details
		PersonalAcct personalBankAccount1 = new PersonalAcct(150.00, "Adam", "Smith", "526 St Charles St", "Winnipeg", "MB", "R3K 1V6");
		// Create a new BusinessAcct object with initial details
		BusinessAcct businessBankAccount1 = new BusinessAcct(1000.00, "Jane", "Matthie", "155 Water St", "St. John's", "NL", "A1C 1B3");
		
		// Print the details of the personal account
		System.out.println("Personal Account:");
		System.out.println(personalBankAccount1);
		
		// Perform a withdrawal from the personal account and display changes
		System.out.println("\nDuring withdrawal:");
		personalBankAccount1.withdrawal(35.00);
		System.out.println("\nAfter withdrawal:");
		System.out.println(personalBankAccount1); // Display account details after withdrawal
		
		// Print the details of the business account
		System.out.println("\nBusiness Account:");
		System.out.println(businessBankAccount1);
		
		// Perform a withdrawal from the business account and display changes
		System.out.println("\nDuring withdrawal:");
		businessBankAccount1.withdrawal(250.00);
		System.out.println("\nAfter withdrawal:");
		System.out.println(businessBankAccount1); // Display account details after withdrawal
	}
}

/* Screen Dump
Case 1:
	Personal Account:
	ASmith
	Adam Smith
	526 St Charles St
	Winnipeg, MB R3K 1V6
	Current balance is $150.00
	
	During withdrawal:
	$60.00 successfully withdrawed!
	Balance below minimum. $2.00 fee applied.
	
	After withdrawal:
	ASmith
	Adam Smith
	526 St Charles St
	Winnipeg, MB R3K 1V6
	Current balance is $88.00
	
	Business Account:
	JMatthie
	Jane Matthie
	155 Water St
	St. John's, NL A1C 1B3
	Current balance is $1,000.00
	
	During withdrawal:
	$750.00 successfully withdrawed!
	Balance below minimum. $10.00 fee applied.
	
	After withdrawal:
	JMatthie
	Jane Matthie
	155 Water St
	St. John's, NL A1C 1B3
	Current balance is $240.00

Case 2:
	Personal Account:
	ASmith
	Adam Smith
	526 St Charles St
	Winnipeg, MB R3K 1V6
	Current balance is $150.00
	
	During withdrawal:
	$35.00 successfully withdrawed!
	
	After withdrawal:
	ASmith
	Adam Smith
	526 St Charles St
	Winnipeg, MB R3K 1V6
	Current balance is $115.00
	
	Business Account:
	JMatthie
	Jane Matthie
	155 Water St
	St. John's, NL A1C 1B3
	Current balance is $1,000.00
	
	During withdrawal:
	$250.00 successfully withdrawed!
	
	After withdrawal:
	JMatthie
	Jane Matthie
	155 Water St
	St. John's, NL A1C 1B3
	Current balance is $750.00


 
 */