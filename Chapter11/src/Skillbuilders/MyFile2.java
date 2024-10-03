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

	}

}
