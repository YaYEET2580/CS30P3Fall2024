package Account_MASTERY;

import java.text.*;

public class PersonalAcct extends Account {
	public double minBal = 100.00;
	public double fee = 2.00;
	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	public PersonalAcct(double bal, String fName, String lName, String st, String c, String pro, String post) {
		super(bal, fName, lName, st, c, pro, post);
	}
	
	public PersonalAcct(String ID) {
		super(ID);
	}
	
	public void withdrawal(double amt) {
		super.withdrawal(amt);
		System.out.println(money.format(amt) + " successfully withdrawed!");
		if (getBalance() < minBal) {
			super.withdrawal(fee);
			System.out.println("Balance below minimum. $2.00 fee applied.");
		}
	}
}
