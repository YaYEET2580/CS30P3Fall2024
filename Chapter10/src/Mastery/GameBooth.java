package Mastery;

import java.util.*;

public class GameBooth {

	private double cost;
	private String firstPrize, consolationPrize;
	
	public GameBooth(double charge, String p1, String p2) {
		 cost = charge;
		 firstPrize = p1;
		 consolationPrize = p2;
	}
	 
	public String start() {
		int toss;
		int successes = 0;
		Random rand = new Random();

		
		for (int i = 0; i < 3; i++) { 
			toss = rand.nextInt(2);
		if (toss == 1) {
			successes += 1; 
		}
	}

		
		if (successes == 3) {
			return(firstPrize);
		} 
		else {
			return(consolationPrize);
		}
	}
	
	public double getCost() {
		return cost;
	}

}
