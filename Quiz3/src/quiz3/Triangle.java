package quiz3;

public class Triangle extends GeometricObject {
	
	double side1;
	double side2;
	double side3;
	
	// create a default triangle with all sides equal to 1
	public Triangle() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	
	// create a custom triangle
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// create a triangle with specified side lengths, color, and filling
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color);
		setFilled(filled);
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	// Heron's formula for the area of a triangle:
	// A = sqrt(p(p-a)(p-b)(p-c)),
	// where p is half of the perimeter, a is side1, b is side3, and c is side 3 
	public double getArea() {
		double p = getPerimeter() / 2;
		return Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
		}
	
	// add the sides to get the 
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	// create a string with the triangle's area and perimeter
	@Override
	public String toString() {
		return "The triangle has an area " + getArea() + " and a perimeter " + getPerimeter();
		
	}
}
