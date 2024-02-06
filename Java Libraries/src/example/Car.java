package example;

public class Car {
	String brand;
	String color;
	int cost;

	Car(String brand, String color, int cost){
		this.brand=brand;
		this.color=color;
		this.cost=cost;
	}
	public String toString() {
		return "brand : " +brand+ "||color : "+color+ " ||cost : "+cost;
	}
}
