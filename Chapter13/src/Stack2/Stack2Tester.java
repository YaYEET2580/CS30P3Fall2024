package Stack2;

public class Stack2Tester {

	public static void main(String[] args) {
		Stack2 s2 = new Stack2(5);
		
		s2.push("Red");
		s2.push("Green");
		s2.push("Yellow");
		System.out.println("Top of Stack s2: " + s2.top());
		System.out.println("Items in Stack s2: " + s2.size());
		s2.pop();
		System.out.println("Top of Stack s2: " + s2.top());
		System.out.println("Items in Stack s2: " + s2.size());

	}

}
