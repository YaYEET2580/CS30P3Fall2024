package ReverseList;

public class ReverseList {
    private Object[] data;
    private int top;

 // Constructor: initializes the list with a specified maximum size
    public ReverseList(int maxItems) {
        data = new Object[maxItems];
        top = -1;
    }

    // Returns the top element without removing it
    public Object top() {
        return data[top];
    }

    // Removes and returns the top element
    public Object pop() {
        top = top - 1;
        return data[top + 1];
    }

    // Adds a new item to the top of the list
    public void push(Object item) {
        if (top < data.length - 1) {
            top = top + 1;
            data[top] = item;
        }
    }

    // Checks if the list is empty
    public boolean isEmpty() {
        return top == -1;
    }

 // Returns the current size of the list
    public int size() {
        return top + 1;
    }

    // Clears the list by resetting the top index
    public void makeEmpty() {
        top = -1;
    }

}