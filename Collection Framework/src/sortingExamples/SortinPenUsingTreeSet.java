package sortingExamples;

import java.util.TreeSet;

public class SortinPenUsingTreeSet {
	public static void main(String[] args) {
		TreeSet<Pen>  t = new TreeSet<Pen>();
		t.add(new Pen(20)); //calls compareTo() in pen class
		t.add(new Pen(30));
		t.add(new Pen(10));
		
		for(Pen p : t) {
			System.out.println(p);
		}
		
	}

}
/**
 * if objects are not comparable in nature,
 * TreeSet throws ClassCastException 
 * */
 