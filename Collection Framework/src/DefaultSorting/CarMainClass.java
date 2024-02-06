package DefaultSorting;

import java.util.TreeSet;



public class CarMainClass {
	public static void main(String[] args) {
		
		Car c1 = new Car("suzuki",600000,"Red");
		Car c2 = new Car("BMW",6000000,"Black");
		Car c3 = new Car("AUDI",500000,"Blue");
		
		TreeSet<Car> t = new TreeSet<Car>();
		t.add(c1);
		t.add(c2);
		t.add(c3);
		
		for(Car c : t) {
			System.out.println(c);
		}
	}

}
