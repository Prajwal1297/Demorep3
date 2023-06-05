/*
 * Area and Perimeter of shapes.
 * @author Prajwal
 * @version jdk11
 * @since 05/06/2023
 */
package abstractDemo;

class Circlea extends Shape {
	public Circlea(int length, int breadth) {
		super(length, breadth);
	}

	public Circlea(int radius) {
		super(radius);
	}

	@Override

	public double area() {
		return 3.14 * getRadius() * getRadius();
	}

	@Override

	public double perimeter() {
		return 2 * 3.14 * getRadius();
	}
}

class Square extends Shape {

	public Square(int length, int breadth) {
		super(length, breadth);
	}

	public Square(int radius) {
		super(radius);
	}

	@Override
	public double area() {
		return getRadius() * getRadius();
	}
	@Override
	public double perimeter() {
		return 4 * getRadius();
	}

	private int getRadius() {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class AbstractShape {

	public static void main(String[] args) {

		Shape s = new Circlea(3);
		System.out.println(" area of circle " + s.area());
		System.out.println(" perimeter of circle " + s.perimeter());
		s = new Square(9);
		System.out.println(" area of square " + s.area());
		System.out.println(" perimeter of square " + s.perimeter());

	}

}