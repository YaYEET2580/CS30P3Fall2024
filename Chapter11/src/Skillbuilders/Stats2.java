package Skillbuilders;

import java.io.*;
import java.text.*;
import java.util.*;

public class Stats2 {
	
	public static void main(String[] args) {
		File dataFile;
		FileReader in;
		String fileName;
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter writeFile;
		int numberStudents;
		String studentName, score;
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScores = 0;
		int numScore = 0;
		NumberFormat percent = NumberFormat.getPercentInstance();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter file name for storing names and grades: ");
		fileName = input.next();
		
		System.out.print("How many students: ");
		numberStudents = input.nextInt();
		
		try {
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for (int i = 0; i < numberStudents; i++) {
				System.out.print("Enter student name: ");
				studentName = input.next();
				
				System.out.print("Enter test grade: ");
				score = input.next();
				
				writeFile.write(studentName);
				writeFile.newLine();
				writeFile.write(score);
				writeFile.newLine();
			}
			writeFile.close();
			out.close();
			System.out.println("The data that you have written is now in the file.");
		} 
		catch (IOException e) {
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}
		
		try {
			dataFile = new File(fileName);
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
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}
		input.close();
	}

}
