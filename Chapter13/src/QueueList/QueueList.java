package QueueList;

public class QueueList {
    
    // The front node of the queue
    private Node front;  
    
    // The rear node of the queue
    private Node rear;   
    
    // The number of elements in the queue
    private int size;    
    
    /**
     * Constructor to initialize an empty queue.
     * Sets front and rear to null and size to 0.
     */
    public QueueList() {
        front = null;
        rear = null;
        size = 0;
    }
    
    /**
     * Adds a new item to the rear of the queue.
     * 
     * param item The item to be added to the queue.
     */
    public void enqueue(Object obj) {
        // Create a new node with the given item
        Node newNode = new Node(obj);
        
        // If the queue is empty, set the new node as the front
        if (isEmpty()) {
            front = newNode;
        } else {
            // Otherwise, link the current rear node to the new node
            rear.next = newNode;
        }
        // Update the rear to the new node
        rear = newNode;
        // Increment the size of the queue
        size++;
    }
    
    /**
     * Removes and returns the item at the front of the queue.
     * 
     * returns The item at the front of the queue.
     * throws IllegalStateException If the queue is empty.
     */
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        
        // Retrieve the data from the front node
        Object obj = front.data;
        // Move the front pointer to the next node
        front = front.next;
        // Decrease the size of the queue
        size--;
        
        // If the queue becomes empty, reset the rear pointer to null
        if (isEmpty()) {
            rear = null; 
        }
        
        return obj;
    }
    
    /**
     * Retrieves the item at the front of the queue without removing it.
     * 
     * returns The item at the front of the queue.
     * throws IllegalStateException If the queue is empty.
     */
    public Object front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }
    
    /**
     * Checks if the queue is empty.
     * 
     * return true if the queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * Returns the number of elements in the queue.
     * 
     * returns The size of the queue.
     */
    public int size() {
        return size;
    }
    
    /**
     * Removes all elements from the queue, resetting it to an empty state.
     */
    public void makeEmpty() {
        front = null;
        rear = null;
        size = 0;
    }

    
}