package Nonprimitivecasting;

public class Solution {
	public static void main(String[] args) {


		//upcasting
		Vehicle v = new Car();
		System.out.println(v.brand + "   " + v.color);
		v.start();
		
		
		System.out.println("-----------------------------------------------");
		
		
		
		//downcasting
		Car c = (Car) v;
		System.out.println(c.brand +" "+c.color+ " " +c.cost+" "+c.fuel);
		c.stop();
		c.start();

	}

}
