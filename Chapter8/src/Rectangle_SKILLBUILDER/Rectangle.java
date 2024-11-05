package Rectangle_SKILLBUILDER;

@SuppressWarnings("rawtypes")
public abstract class Rectangle implements Comparable {
	private double length;
	private double width;

	public Rectangle() {
		length = 1;
		width = 1;
	}
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	public void setLength(double l) {
		length = l;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double area() {
		double rectangleArea;
		rectangleArea = length * width;
		return rectangleArea;
	}
	
	public static void displayAreaFormula() {
		System.out.println("The formula for the area of a rectangle is: area = length * width");
	}
	
	public double perimeter() {
		double rectanglePerimeter;
		rectanglePerimeter = 2 * (length + width);
		return rectanglePerimeter;
	}
	
	public boolean equals(Object r) {
		Rectangle testObj = (Rectangle)r;
		if (testObj.getLength() == length && testObj.getWidth() == width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String rect;
		rect = "Rectangle has a length of " + length + " and a width of " + width;
		return rect;
	}
	
	public int compareTo(Object rect) {
		Rectangle testRectangle = (Rectangle)rect;
		
		if (width < testRectangle.getWidth() && length < testRectangle.getLength()) {
			return -1;
		}
		else if (width == testRectangle.getWidth() && length == testRectangle.getLength()) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public int compareToArea(Object areaRect) {
		Rectangle testAreaRectangle = (Rectangle)areaRect;
		
		if (rectangleArea < testAreaRectangle.area()) {
			return -1;
		}
		else if (rectangleArea < testAreaRectangle.area()) {
			return 0;
		}
		else {
			return 1;
		}
		
	}

}