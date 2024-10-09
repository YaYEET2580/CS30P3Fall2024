package Skillbuilders;

import java.io.*;

public class Assignment {
	
	public static void main(String[] args) {
		File dataFile = new File("../Chapter11/src/Skillbuilders/Assignment.txt");
		FileReader in;
		BufferedReader readFile;
		String displays;
		
		try {
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			while ((displays = readFile.readLine()) != null) {
				System.out.println(displays);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());

        } 
		catch (IOException e) {
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}

	}

}
