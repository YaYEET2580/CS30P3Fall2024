/*

Program: testStackList.java          Last Date of this Revision: December 16, 2024

Purpose: An application that implements a StackList class that 
implements a stack using a linked list that can store Object data.

Author: Sakibul Majid 
School: CHHS
Course: Computer Programming 30
 

*/


package StackList;

import java.util.Scanner;

public class testStackList {

	public static void main(String[] args) {
		// Create a new stack instance
		StackList sl = new StackList();
		String word;
		Scanner input = new Scanner(System.in);

		// Loop to take user input until 'S' is entered
		while (true) {
        	System.out.print("Please enter any kind or word (enter 'S' to stop): ");
        	word = input.next();
        	
        	if (word.equalsIgnoreCase("s")) { //Break method
        		break;
        	}
        	
        	sl.push(word); // Push the input onto the stack
        }
        
		// Display the current size and top element of the stack
        System.out.println("\nCurrent size of the stack: " + sl.size());
        System.out.println("Top element: " + sl.top());
        
        // Pop and display all elements from the stack
        System.out.println("\nObjects being popped from this stack list: ");
        while (!sl.isEmpty()) {
            System.out.println("Popped: " + sl.pop());
        }
        
        // Display the size of the stack after popping all elements
        System.out.println("\nStack size after popping all elements: " + sl.size());

        // Attempt to pop from an empty stack to demonstrate exception handling
        try {
        	sl.pop();
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        input.close(); // Close the scanner
	}

}

/* Screen Dump
Case 1:
	Please enter any kind or word (enter 'S' to stop): Toyota
	Please enter any kind or word (enter 'S' to stop): Honda
	Please enter any kind or word (enter 'S' to stop): Nissan
	Please enter any kind or word (enter 'S' to stop): s
	
	Current size of the stack: 3
	Top element: Nissan
	
	Objects being popped from this stack list: 
	Popped: Nissan
	Popped: Honda
	Popped: Toyota
	
	Stack size after popping all elements: 0
	Exception caught: Stack is empty

Case 2:
	Please enter any kind or word (enter 'S' to stop): Ford
	Please enter any kind or word (enter 'S' to stop): Chevrolet
	Please enter any kind or word (enter 'S' to stop): Dodge
	Please enter any kind or word (enter 'S' to stop): s
	
	Current size of the stack: 3
	Top element: Dodge
	
	Objects being popped from this stack list: 
	Popped: Dodge
	Popped: Chevrolet
	Popped: Ford
	
	Stack size after popping all elements: 0
	Exception caught: Stack is empty

 
 */