/*

Program: testReverseList.java          Last Date of this Revision: December 16, 2024

Purpose: An application that uses a stack to reverse a set of integers entered by the user. The
user should be prompted to enter up to 10 numbers or to terminate the list of numbers by entering 999. 

Author: Sakibul Majid 
School: CHHS
Course: Computer Programming 30
 

*/

package ReverseList;

import java.util.Scanner;

public class testReverseList {
	public static void main(String[] args) {
        ReverseList rl = new ReverseList(10); // Creates a ReverseList with a max size of 10
        
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int number;

        // Continuously prompts the user for numbers until 999 is entered
        while (true) {
            System.out.print("Please enter a number (enter 999 to stop): ");
            number = input.nextInt();

            if (number == 999) {
                break; // Stops the input loop
            }

            rl.push(number); // Adds the entered number to the list
        }

        System.out.println("\nNumbers in reverse order:");
        
        // Prints and removes numbers from the list in reverse order
        while (!rl.isEmpty()) {
            System.out.print(rl.pop() + " ");
        }
       
        
        
	}
	
	
	
}
/* Screen Dump
Case 1:
	Please enter a number (enter 999 to stop): 3
	Please enter a number (enter 999 to stop): 7
	Please enter a number (enter 999 to stop): 2
	Please enter a number (enter 999 to stop): 5
	Please enter a number (enter 999 to stop): 1
	Please enter a number (enter 999 to stop): 999
	
	Numbers in reverse order:
	1 5 2 7 3 

Case 2:
	Please enter a number (enter 999 to stop): 44
	Please enter a number (enter 999 to stop): 34
	Please enter a number (enter 999 to stop): 45
	Please enter a number (enter 999 to stop): 86
	Please enter a number (enter 999 to stop): 12
	Please enter a number (enter 999 to stop): 85
	Please enter a number (enter 999 to stop): 999
	
	Numbers in reverse order:
	85 12 86 45 34 44 
	 
 */