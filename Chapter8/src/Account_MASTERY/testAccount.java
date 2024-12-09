package Account_MASTERY;
public class testAccount {
	public static void main(String[] args) {
		PersonalAcct personalBankAccount1 = new PersonalAcct(150.00, "Adam", "Smith", "526 St Charles St", "Winnipeg", "MB", "R3K 1V6");
		BusinessAcct businessBankAccount1 = new BusinessAcct(1000.00, "Jane", "Matthie", "155 Water St", "St. John's", "NL", "A1C 1B3");
		
		System.out.println("Personal Account:");
		System.out.println(personalBankAccount1);
		System.out.println("\nDuring withdrawal:");
		personalBankAccount1.withdrawal(60.00);
		System.out.println("\nAfter withdrawal:");
		System.out.println(personalBankAccount1);
		
		System.out.println("\nBusiness Account:");
		System.out.println(businessBankAccount1);
		System.out.println("\nDuring withdrawal:");
		businessBankAccount1.withdrawal(750.00);
		System.out.println("\nAfter withdrawal:");
		System.out.println(businessBankAccount1);
		
		
	}
}
