/*

Program: test.java          Last Date of this Revision: December 16, 2024

Purpose: An application that implements a QueueList class that 
implements a queue using a linked list that can store Object data.

Author: Sakibul Majid 
School: CHHS
Course: Computer Programming 30

*/


package QueueList;

import java.util.Scanner;

public class testQueueList {

	public static void main(String[] args) {
		// Create a new queue instance
		QueueList ql = new QueueList();
		String word;
		Scanner input = new Scanner(System.in);

		// Loop to take user input until 'S' is entered
		while (true) {
        	System.out.print("Please enter any kind or word (enter 'S' to stop): ");
        	word = input.next();
        	
        	if (word.equalsIgnoreCase("s")) { //Break method
        		break;
        	}
        	
        	ql.enqueue(word); // Push the input onto the stack
        }

		 // Check the size of the queue
        System.out.println("\nQueue size: " + ql.size());

        // Peek at the front element
        System.out.println("\nFront of the queue: " + ql.front());

        // Dequeue objects and display them
        System.out.println("\nDequeuing objects:");
        while (!ql.isEmpty()) {
            System.out.println(ql.dequeue());
        }

        // Check if the queue is empty
        System.out.println("\nIs the queue empty? " + ql.isEmpty());

        // Attempt to dequeue from an empty queue (should throw an exception)
        try {
            ql.dequeue();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        input.close();
        
    


	}

}

/* Screen Dump
Case 1:
	Please enter any kind or word (enter 'S' to stop): Toyota
	Please enter any kind or word (enter 'S' to stop): Subaru
	Please enter any kind or word (enter 'S' to stop): Nissan
	Please enter any kind or word (enter 'S' to stop): Honda
	Please enter any kind or word (enter 'S' to stop): Mitsubishi
	Please enter any kind or word (enter 'S' to stop): s
	
	Queue size: 5
	
	Front of the queue: Toyota
	
	Dequeuing objects:
	Toyota
	Subaru
	Nissan
	Honda
	Mitsubishi
	
	Is the queue empty? true
	Error: Queue is empty


Case 2:
	Please enter any kind or word (enter 'S' to stop): Biology
	Please enter any kind or word (enter 'S' to stop): Math
	Please enter any kind or word (enter 'S' to stop): Chemistry
	Please enter any kind or word (enter 'S' to stop): s
	
	Queue size: 3
	
	Front of the queue: Biology
	
	Dequeuing objects:
	Biology
	Math
	Chemistry
	
	Is the queue empty? true
	Error: Queue is empty
	
	 
 */