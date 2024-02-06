package sortingExamples;

import java.util.*;

public class SortingCarUsingArrayList {
public static void main(String[] args) {
		
			SortCarByCost cost = new SortCarByCost();
		ArrayList<Car> t = new ArrayList<Car>();
		 t.add(new Car(200));
		 t.add(new Car(300));
		 t.add(new Car(100));
		 
		 Collections.sort(t,cost);
		 for(Car c : t) {
			 System.out.println(c);
		 }
	}

}
