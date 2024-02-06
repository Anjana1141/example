package DefaultSorting;

import java.util.TreeSet;

public class HotelMain {
	public static void main(String[] args) {
		
		Hotel h1 = new Hotel("rialto", 4.1);
		Hotel h2 = new Hotel("marvella", 4.3);
		Hotel h3 = new Hotel("venus", 4.0);
				
		TreeSet<Hotel> t = new TreeSet<Hotel>();
		t.add(h1);
		t.add(h2);
		t.add(h3);
		
		for(Hotel h : t) {
			System.out.println(h);
		}
	}

}
