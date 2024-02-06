package sortingExamples;

import java.util.ArrayList;
import java.util.Collections;


public class SortingUsingPenArrayList {
	public static void main(String[] args) {
		ArrayList<Pen>  l = new ArrayList<Pen>();
		l.add(new Pen(20));
		l.add(new Pen(30));
		l.add(new Pen(10));
   
		Collections.sort(l);//calls compareTo() of pen class
		for(Pen p : l) {
			System.out.println(p);

		}
	}
}

/*
 * if objects are not comparable in nature, 
 * Collections.sort(l) gives compilation error
 */
 

