/*

Program: FindAndReplace.java          Last Date of this Revision: October 21, 2024

Purpose: An application that prompts the user for a file name, a search word or phrase,
and a replacement word or phrase. After entering the replacement word or phrase, FindAndReplace
finds all occurrences of the search word or phrase in a file and replaces them with the specified replacement word or phrase.


Author: Sakibul Majid 
School: CHHS
Course: Computer Programming 30
 

*/

package Mastery;

import java.io.*;
import java.util.Scanner;

public class FindAndReplace {
    public static void main(String[] args) {
        File file;  // Represents the file to be processed
        String fileName, oldWord, newWord, line, newContent;  // Variables for file name, words to replace, and content processing
        String oldContent = "";  // Holds the original content of the file
        FileWriter out;  // For writing the modified content back to the file
        BufferedReader readFile;  // For reading the file content
        Scanner input = new Scanner(System.in);  // Scanner object to read user input

        // Prompt the user for the file name
        System.out.print("Enter the file name: ");
        fileName = input.nextLine();

        // Prompt the user for the old word to be replaced
        System.out.print("Enter in the old word: ");
        oldWord = input.nextLine();

        // Prompt the user for the new word to replace the old word
        System.out.print("Enter in the new word: ");
        newWord = input.nextLine();

        try {
            // Create a File object with the provided file name
            file = new File(fileName);
            // BufferedReader to read the content of the file
            readFile = new BufferedReader(new FileReader(file));

            // Reading all lines of the file and storing in oldContent
            line = readFile.readLine();
            while (line != null) {
                // Append each line with a line separator to preserve formatting
                oldContent = oldContent + line + System.lineSeparator();
                line = readFile.readLine();  // Continue reading lines
            }

            // Replace occurrences of oldWord with newWord in the file content
            newContent = oldContent.replaceAll(oldWord, newWord);

            // FileWriter to overwrite the original file with the modified content
            out = new FileWriter(file);
            out.write(newContent);  // Write the new content to the file

            // Close file readers and writers to free up system resources
            readFile.close();
            out.close();
            
            System.out.println("Success!");
        }
        catch (FileNotFoundException e) {
            // Handle the case where the file is not found
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        }
        catch (IOException e) {
            // Handle any I/O errors during file reading/writing
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
        }

        // Close the Scanner object to avoid resource leakage
        input.close();
    }
}
/* Screen Dump

Case 1:
Enter the file name: ../Chapter11/src/Mastery/source.txt
Enter in the old word: Hello
Enter in the new word: Hi
Success!

Case 2:
Enter the file name: ../Chapter11/src/Mastery/source.txt
Enter in the old word: Hi
Enter in the new word: Hello
Success!

 
 */