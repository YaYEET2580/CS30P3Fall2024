package Rectangle_SKILLBUILDER;

public class testRectangle {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2.5, 5);
		Rectangle r2 = new Rectangle(3.5, 7);
		
		r.setLength(3.5);
		r.setWidth(7);
		
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.area());
		Rectangle.displayAreaFormula();
		System.out.println(r.perimeter());
		
		System.out.println(r);
		
		if (r.equals(r2)) {
			System.out.println("r and r2 are equal.");
		}
		else {
			System.out.println("r and r2 are not equal.");
		}
		
		if (r.compareTo(r2) == -1) {
			System.out.println("The width and length for 'r' is less than the width and length for 'r2'.");
		}
		
		else if (r.compareTo(r2) == 0) {
			System.out.println("The width and length for 'r' is equal to the width and length for 'r2'.");
		}
		
		else if (r.compareTo(r2) == 1) {
			System.out.println("The width and length for 'r' is greater than the width and length for 'r2'.");
		}
	}

}
