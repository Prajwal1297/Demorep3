package singleInheritence;

class Vehical {
	String make;
	String model;
	int year;

	public Vehical(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;

	}

	public void displayInfo() {
		System.out.println("Vehical's : " + make);
		System.out.println("Vehical's : " + model);
		System.out.println("Vehical's : " + year);
	}
}

class Car extends Vehical {
	int numDoors;

	public Car(String make, String model, int year, int numDoors) {
		super(make, model, year);
		this.numDoors = numDoors;
	}

	public void startengine() {
		System.out.println("engine started");
	}

	class Motorcycle extends Vehical {
		private boolean isDoorsThere;

		public Motorcycle(String make, String model, int year, boolean numDoors) {
			super(make, model, year);
			this.isDoorsThere = isDoorsThere;
		}

		public String startEngine() {

			return "Engine Started";
		}

public class HirechialVehical {

	public static void main(String[] args) {
		Car c1 = new Car("India", "Toyota", 2023, 5);

        System.out.println(c1);
        System.out.println(c1.startengine());
        Motorcycle mc1 = new Motorcycle("India", "Bullet", 2023, false);
        System.out.println(mc1);
        System.out.println(c1.startengine());
	}

}
	}
}
