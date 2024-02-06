package FTP;


public class Vehicle {
	void travel(){
		System.out.println("travelling in vehicle:");
	}

}
class Bike extends Vehicle{
	@Override
	void travel() {
		System.out.println("traveling in bike");
	}
}
class Car extends Vehicle{
	@Override
	void travel() {
		System.out.println("travelling in car");
	}
}
class Bus extends Vehicle{
	@Override
	void travel() {
		System.out.println("travelling in bus");
	}
}
