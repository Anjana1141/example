package sortingObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarMainClass {


	public static void main(String[] args) {
		Car c1 = new Car(3000000);
		Car c2 = new Car(6000000);
		Car c3 = new Car(5000000);

		ArrayList<Car> a = new ArrayList<Car>();
		a.add(c1);
		a.add(c2);
		a.add(c3);

		System.out.println("before sorting -------");
		for(Car c : a) {
			System.out.println(c);
		}


		Collections.sort(a);//sort method searches for compareTo() in car class.
		System.out.println("after sorting-------------");
		for(Car c : a) {
			System.out.println(c);
		}
		Collections.reverse(a);
		System.out.println("desending order reverse------------");
		for(Car c :a ) {
			System.out.println(c);
		}
	}

}
