package customSorting;

import java.util.Comparator;

public class SortCarByBrand implements Comparator<Car>{
	@Override
	public int compare(Car c , Car d) {
		String i=c.brand;
		String j=d.brand;
		return i.compareTo(j);
		//return c.brand.compareTo(d.brand);
	}
	
	

}

//for string comparison we cannot use (-) , we need to use compareTo() of string class