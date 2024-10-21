package Mastery;
//Import input and formatting tool
import java.util.Scanner;
import java.io.Serializable;
import java.text.NumberFormat;

@SuppressWarnings("serial")
public class PiggyBank implements Serializable { //Implement serializable to the object in order for it to be stored and loaded
	//Class declarations
	public static double penny = 0.01;
	public static double nickel = 0.05;
	public static double dime = 0.10;
	public static double quarter = 0.25;
	public static double total;
	public static double withdrawal;
	
	//Base constructor
	public PiggyBank() {
		total = 0;
		withdrawal = 0;
	}
	
	//Overloaded constructor
	public PiggyBank(double t, double w) {
		total = t;
		withdrawal = w;
	}
	
	//Method to add a penny to total amount
	public double AddPenny() {
		total += penny;
		return total; //Return updated total
	}
	
	//Method to add a nickel to total amount
	public double AddNickel() {
		total += nickel;
		return total; //Return updated total
	}
	
	//Method to add a dime to total amount
	public double AddDime() {
		total += dime;
		return total; //Return updated total
	}
	
	//Method to add a dime to total amount
	public double AddQuarter() {
		total += quarter;
		return total; //Return updated total
	}
	
	//Method to withdraw an amount from total
	public double WithdrawAmount() {
		@SuppressWarnings("resource") //Suppress warning of input stream not being closed
		//Prompt the user of how much money they want to withdraw
		Scanner input = new Scanner(System.in);
		System.out.print("How much money would you like to withdraw?: ");
		withdrawal = input.nextDouble(); //Store user's input in the withdrawal variable
		total -= withdrawal; //Subtract the total amount in bank by the withdrawal amount
		return total; //Return updated total
	}
	
	//Method to display total in bank
	public static void dollarAmount() {
		NumberFormat money = NumberFormat.getCurrencyInstance(); //Format currency setup
		System.out.println("Your total is: " + money.format(total)); //Print out formatted total
	}
	
	

}