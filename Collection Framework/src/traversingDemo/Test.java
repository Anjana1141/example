package traversingDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test {
	public static void main(String[] args) {

		LinkedHashSet<Double> lh = new LinkedHashSet<Double>();
		lh.add(1.5);
		lh.add(2.3);
		lh.add(3.5);
		lh.add(1.5);
		
		for(double d : lh) {
			System.out.println(d);
		}
		System.out.println("====");
		Iterator<Double> it = lh.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
