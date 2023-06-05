package singleInheritence;

class Vehicle {
	public void run() {
		System.out.println("Inside Vehical Run Method");
	}
}
class Truck extends Vehicle {
    public void run() {
	System.out.println("Inside Truck Run Method");
}
class Bike extends Vehicle{
	public void run() {
		System.out.println("Inside Bike Run Method");
	}
  }
}
public class DemoMethodOverRiding {

	public static void main(String[] args) {
		Vehicle vehicle;// new vehicle();
		//vehicle.run();// Base class 
		vehicle = new Truck();
		vehicle.run();//Bike class run() method
	}
        
	}

