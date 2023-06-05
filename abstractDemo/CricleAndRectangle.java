package abstractDemo;

interface Shape {
	double getPerimeter();
}

class Cricle implements Shape {
	float radius;

	public Cricle(float radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (Math.PI * radius * radius);
	}

	public double getPerimeter() {
		return (2 * Math.PI * radius);
	}

	class Rectangle implements Shape {
		float length, breadth;

		public Rectangle(float length, float breadth) {
			this.length = length;
			this.breadth = breadth;
		}
		@Override
		public double getArea() {
			return (length * breadth);
		}
		@Override
	    public double getPerimeter() {
	        return (2*(length+breadth));

		public double getArea() {
			return (length * breadth);
		}
	}
}

public class CricleAndRectangle {

	public static void main(String[] args) {
		Circle c1 = new Circle(4);
		System.out.println("area of circle: " + c1.getArea());
		System.out.println("perimerter of circle: " + c1.getPerimeter());
		Rectangle r1 = new Rectangle(7.0f, 8f);
		System.out.println("area of rectangle: " + r1.getArea());
		System.out.println("perimerter of rectangle: " + r1.getPerimeter());
	}

}
