/*

Program: WordCount.java          Last Date of this Revision: October 21, 2024

Purpose: An application that displays the number of words and the average word length in a
text file named source.txt

Author: Sakibul Majid 
School: CHHS
Course: Computer Programming 30
 

*/


package Mastery;

import java.io.*;
import java.text.*;

public class WordCount {

    public static void main(String[] args) {
        // Define the file path to the source file to be read
        File dataFile = new File("../Chapter11/src/Mastery/source.txt");
        FileReader in;  // FileReader to read characters from the file
        BufferedReader readFile;  // BufferedReader to read the file line by line
        int wordCount = 0;  // Counter for the total number of words
        int totalWordLength = 0;  // Sum of the lengths of all words
        double averageWordLength;  // Average length of the words
        String line;  // Variable to hold each line read from the file
        String[] words;  // Array to store words after splitting each line
        NumberFormat decimal = NumberFormat.getNumberInstance();  // Formatter to display numbers with formatting

        try {
            // Open the file and prepare to read it
            in = new FileReader(dataFile);
            readFile = new BufferedReader(in);

            // Read the file line by line
            while ((line = readFile.readLine()) != null) {
                // Split each line into words, excluding non-alphabetic characters
                words = line.split("[^a-zA-Z]+");

                // Count the words and calculate their lengths
                for (String word : words) {
                    if (!(word.length() == 0)) {  // Ignore empty strings
                        wordCount++;  // Increment word count
                        totalWordLength += word.length();  // Add to total word length
                    }
                }
            }

            // Close the input streams after reading the file
            in.close();

            // Calculate and display the word count and average word length
            if (wordCount > 0) {
                averageWordLength = (double) totalWordLength / wordCount;  // Calculate average word length
                System.out.println("Number of words: " + wordCount);
                System.out.println("Average word length: " + decimal.format(averageWordLength));
            } else {
                System.out.println("No words found in the file.");  // Case when no words are found
            }

        } catch (FileNotFoundException e) {
            // Handle the case when the file is not found
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            // Handle any I/O exceptions during file reading
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
        }
    }
}

/* Screen Dump

Case 1:
Number of words: 2
Average word length: 5

Case 2:
Number of words: 2
Average word length: 5 
*/
