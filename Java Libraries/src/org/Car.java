package org;

public class Car {
	int cost;
	Car(int cost){
		this.cost=cost;
	}
	
	//--------------------Rules---------------------------------------------
	//1.UPCASTING
	//2.DOWNCASTING
	//3.comparison logic
	public boolean equals(Object obj) {
		Car c2 = (Car) obj;
		return this.cost == c2.cost;
	}
}
