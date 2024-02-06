package Org;
//Accessing public class with different package
import com.Car;
public class Solution {
	public static void main(String[] args) {
		System.out.println(Car.brand);
		Car c = new Car();
		System.out.println(c.cost);
	}

}
