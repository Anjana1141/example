package sortingObject;

public class Car implements Comparable<Car>{
	int cost;
	
	Car(int cost){
		this.cost=cost;
	}
	
	
	public String toString() {
		return "cost of the car is " + cost;
	}
	public int compareTo(Car c) {
		return this.cost-c.cost;
	}

}
