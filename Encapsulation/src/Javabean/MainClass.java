package Javabean;

public class MainClass {
	public static void main(String[] args) {
		Car c = new Car();
		
		c.setBrand("BMW");
		String brand = c.getBrand();
		System.out.println("brandname : " +brand);
		
	}

}
