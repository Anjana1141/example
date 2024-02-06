package sortingExamples;


import java.util.TreeSet;

public class SortingCarUsingTreeSet {
	public static void main(String[] args) {
		
		SortCarByCost cost = new SortCarByCost();
		 TreeSet<Car> t = new TreeSet<Car>(cost);
		 t.add(new Car(200));
		 t.add(new Car(300));
		 t.add(new Car(100));
		 
		 for(Car c : t) {
			 System.out.println(c);
		 }
	}

}
