package sortingExamples;

import java.util.Comparator;

public class SortCarByCost implements Comparator<Car>{
	
	public int compare(Car c, Car d) {
		return c.cost-d.cost;
	}
	

}
