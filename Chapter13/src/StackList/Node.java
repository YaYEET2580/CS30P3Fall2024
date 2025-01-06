package StackList;

public class Node {
	// Holds the data for this node
	private Object data;
	// Points to the next node in the list
	private Node next;
	
	// Constructor to initialize the node with data
	public Node(Object newData) {
		data = newData;
		next = null;
	}
	
	// Returns the next node
	public Node getNext() {
		return(next);
	}

	// Sets the next node
	public void setNext(Node newNode) {
		next = newNode;
	}
	
	// Retrieves the data stored in the node
	// Assumes the data is a String, consider improving type safety
	public Object getData() {
		return((String)data);
	}

}