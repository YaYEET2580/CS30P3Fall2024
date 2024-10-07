package Skillbuilders;

import java.io.*;
import java.text.*;


public class Stats1 {

	public static void main(String[] args) {
		File dataFile = new File("../Chapter11/src/Skillbuilders/test1.txt");
		FileReader in;
		BufferedReader readFile;
		String studentName, score;
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScores = 0;
		int numScore = 0;
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		try {
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			while ((studentName = readFile.readLine()) != null) {
				score = readFile.readLine();
				System.out.println(studentName + " " + score);
				numScore += 1;
				scoreValue = Double.parseDouble(score);
				totalScores = totalScores + scoreValue;
				
				if (scoreValue < lowScore) {
					lowScore = scoreValue;
				}
				if (scoreValue > highScore) {
					highScore = scoreValue;
				}
				
			}
			avgScore = totalScores / numScore;
			
			System.out.println("Low Score = " + percent.format(lowScore/100));
			System.out.println("High Score = " + percent.format(highScore/100));
			System.out.println("Average = " + percent.format(avgScore/100));
			
			in.close();
		}
		catch (FileNotFoundException e) 
        {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());

        } 
		catch (IOException e) {
			
		}

		

	}

}
