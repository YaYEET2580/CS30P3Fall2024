package StackList;

public class StackList {
	// Points to the top node of the stack
		private Node head;    
		// Tracks the size of the stack
		private int size;   
	    
	    // Constructor to initialize an empty stack
	    public StackList() {
	        head = null;
	        size = 0;
	    }
    
	// Pushes a new element onto the stack
    public void push(Object obj) {
        Node newNode = new Node(obj);
        newNode.setNext(head); // Link the new node to the current head
        head = newNode; // Update the head to the new node
        size++;
    }
    
    // Removes and returns the top element from the stack
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty"); // Handle underflow
        }
        Object obj = head.getData(); // Retrieve data from the top node
        head = head.getNext(); // Move the head to the next node
        size--; // Decrement size
        return obj;
    }
    
    // Returns the top element without removing it
    public Object top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty"); // Handle underflow
        }
        return head.getData(); // Return the data of the top node
    }
    
    // Checks if the stack is empty
    public boolean isEmpty() {
        return head == null;
    }
    
    // Returns the number of elements in the stack
    public int size() {
        return size;
    }
    
    // Clears the stack by resetting head and size
    public void makeEmpty() {
        head = null;
        size = 0;
    }

}