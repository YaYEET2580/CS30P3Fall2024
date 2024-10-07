package Skillbuilders;

import java.io.File;
import java.util.Scanner;

public class MyFile1 {

	public static void main(String[] args) {
		//Declaration
		File textFile;
		Scanner input = new Scanner(System.in);
		String fileName;
		
		//Obtain file name from user
		System.out.print("Please enter a file name: ");
		fileName = input.nextLine();
		
		//Determine if file exists
		textFile = new File(fileName);
		
		if (textFile.exists()) {
			System.out.println("File exists");
		}
		else {
			System.out.println("File does not exists");
		}
		input.close();

	}

}