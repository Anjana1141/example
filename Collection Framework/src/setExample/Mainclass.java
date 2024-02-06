package setExample;

import java.util.TreeSet;

public class Mainclass {
	public static void main(String[] args) {

		TreeSet<String> t = new TreeSet<String>();
		t.add("C");
		t.add("B");
		t.add("A");

		for(String s : t) {
			System.out.println(s);
		}

	}

}
