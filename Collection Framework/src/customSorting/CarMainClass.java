package customSorting;

import java.util.TreeSet;



public class CarMainClass {
	public static void main(String[] args) {

		Car c1 = new Car("BMW");
		Car c2 = new Car("Audi");
		Car c3 = new Car("Cooper");

		SortCarByBrand brand = new SortCarByBrand();
		TreeSet<Car> t = new TreeSet<Car>(brand);
		t.add(c1);
		t.add(c2);
		t.add(c3);
		
		for(Car c : t) {
			System.out.println(c);
		}

	}

}
