package comm;

public class Car {
	String brand;
	int cost;
	
	Car(String brand){
		this.brand=brand;
		
	}
	Car(String brand , int cost){
		//this(brand);
		//this.cost=cost;
		
	}
	public static void main(String args[]) {
		Car c = new Car("BMW" , 20000000);
		System.out.println("brandName : " + c.brand + " cost : " + c.cost);
	}

}
