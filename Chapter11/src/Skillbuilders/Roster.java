package Skillbuilders;

import java.io.*;
import java.util.*;

public class Roster {

	public static void main(String[] args) {
		File dataFile;
		FileReader in;
		String fileName;
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter writeFile;
		int numberStudents;
		String firstName, lastName;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the file name for storing the students names: ");
		fileName = input.next();
		
		System.out.print("How many students?: ");
		numberStudents = input.nextInt();
		
		try {
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for (int i = 0; i < numberStudents; i++) {
				System.out.print("Enter student's first name: ");
				firstName = input.next();
				
				System.out.print("Enter student's last name: ");
				lastName = input.next();
				
				writeFile.write(firstName);
				writeFile.newLine();
				writeFile.write(lastName);
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
			
			while ((firstName = readFile.readLine()) != null) {
				lastName = readFile.readLine();
				System.out.println(firstName + " " + lastName);
				
			}
			in.close();
		}
		catch (FileNotFoundException e) {
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
