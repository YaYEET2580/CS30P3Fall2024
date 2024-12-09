package Account_MASTERY;

import java.text.*;

public class BusinessAcct extends Account {
	public double minBal = 500.00;
	public double fee = 10.00;
	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	public BusinessAcct(double bal, String fName, String lName, String st, String c, String pro, String post) {
		super(bal, fName, lName, st, c, pro, post);
	}
	
	public BusinessAcct(String ID) {
		super(ID);
	}
	
	public void withdrawal(double amt) {
		super.withdrawal(amt);
		System.out.println(money.format(amt) + " successfully withdrawed!");
		if (getBalance() < minBal) {
			super.withdrawal(fee);
			System.out.println("Balance below minimum. $10.00 fee applied.");
		}
	}
}
