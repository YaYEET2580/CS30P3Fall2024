package Mastery;

import java.util.*;

import javax.swing.ImageIcon;

public class GameBooth {

	public double cost;
	public ImageIcon firstPrize;
	public ImageIcon consolationPrize;
	
	public GameBooth(double charge) {
		 cost = charge;
		 firstPrize = new ImageIcon("C:\\Users\\37168004\\git\\CS30P3Fall2024\\Chapter10\\src\\Images\\BreakAPlate%20Images\\sticker.gif");
		 consolationPrize = new ImageIcon("C:\\Users\\37168004\\git\\CS30P3Fall2024\\Chapter10\\src\\Images\\BreakAPlate%20Images\\tiger_plush.gif");
	}
	

	public ImageIcon start() {
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
