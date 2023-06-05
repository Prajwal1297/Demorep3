package singleInheritence;

class circle {
	private double radius = 1.0;
	private String colour = "Red";

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {

		return "Circle [radius=" + radius + ", colour=" + colour + "]";
	}

	public double getArea() {

		double area;
		area = (2 * Math.PI * radius);
		System.out.println("the area of circle is : " + area);
		return area;

	} 
}
class Cylinder extends Cricle {
	private double height = 1.0;
public Cylinder() { 
super();
}
public Cylinder (double radius) {
	super(radius);
}
public Cylinder (double radius,double height) {
	super (radius);
	this.height = height;
}

public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double getVolume() {
	return getArea()* height;
}
public String toString() {
	return "Height ; "+ height + "]";
 }
}
public class AreaOfCricle {
	public static void main(String[] args) {
		Cylinder c1 = new Cylinder(2.3,3.5);
		System.out.println(" Radius : " + c1.getRadius());//2.3
		System.out.println("Colour : " + c1.getColor());//red
		System.out.println(c1);//3
		System.out.println("Volume of the Cylinder :+" c1.getVolume() );
	}

}
	



