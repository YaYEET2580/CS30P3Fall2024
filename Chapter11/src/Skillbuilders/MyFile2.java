package Skillbuilders;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFile2 {

	public static void main(String[] args) {
		//Declaration
		File textFile;
		Scanner input = new Scanner(System.in);
		String response;
		
		//Create the file
		textFile = new File("../Chapter11/src/Skillbuilders/zzz.txt");
		
		if (textFile.exists()) {
			System.out.println("zzz.txt exists");
		}
		else {
			try {
				textFile.createNewFile();
				System.out.println("zzz.txt file created.");
			}
			catch (IOException e) {
				System.out.println("File could not be created.");
    			System.err.println("IOException: " + e.getMessage());
    		}
		}
		
		//Delete the file if user chooses
		System.out.print("Would you like to (K)eep this file or (D)elete it?: ");
		response = input.nextLine();
		
		if (response.equalsIgnoreCase("D")) {
			//Delete
			if(textFile.delete()) {
				System.out.println("File successfully deleted.");
			}
		}
		else {
			System.out.println("File is being kept and will stay the same.");
		}
		input.close();

	}

}
