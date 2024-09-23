package LocalBank;

import java.util.ArrayList;

public class Bank {
	
	public ArrayList accounts;
	
	public Bank() {
		accounts = new ArrayList();
	}
	
	public String addAccount(String fName, String lName, double balance) {
		Account newAccount = new Account(balance, fName, lName);
		accounts.add(newAccount);
		
		return(newAccount.getID());
	}
	
	 public String deleteAccount(String acctID) 
	 {
		 int accountIndex;
		 Account accountToMatch;
		 
		 accountToMatch = new Account(acctID);
		 accountIndex = accounts.indexOf(accountToMatch); //retrieve location of account
		 if (accountIndex > -1) {
		 accounts.remove(accountIndex); //remove account
		 	return("Account removed.");
		 } 
		 else {
			return("Account does not exist.");
		 }
	 }
	 
	 public String transaction(int transactionCode, String accountID, double amt) 
	 {
		 int accountIndex;
		 Account acctToMatch, account;

		 acctToMatch = new Account(accountID);
		 accountIndex = accounts.indexOf(acctToMatch); //retrieve location of account
		 
		 if (accountIndex > -1)
		 {
			 account = (Account)accounts.get(accountIndex); //retrieve object to modify
			 if (transactionCode == 1) 
			 {
				 account.deposit(amt);
				 accounts.set(accountIndex, account); //replace object with updated object
				 return(account.toString());
			 	
			 } 
			 else if (transactionCode == 2) 
			 {
				 account.withdrawal(amt);
				 accounts.set(accountIndex, account); //replace object with updated object
				 return(account.toString());
			 	
			 }
			 } 
		 
			
		
		 
		 return("Account does not exist.");
	 }	 
	 
	 
	 public String checkBalance(String accountID) {
		 int accountIndex;
		 Account accountToMatch, account;
		 
		 accountToMatch = new Account(accountID);
		 accountIndex = accounts.indexOf(accountToMatch); //retrieve location of account
		 
		 if (accountIndex > -1) {
			 account = (Account)accounts.get(accountIndex); //retrieve object to display
			 return(account.toString());
		} 
		 else {
			 return("Account does not exist.");
		}


	 }
	 
	 
		

}
