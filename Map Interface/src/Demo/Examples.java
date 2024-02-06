package Demo;


import java.util.*;

public class Examples {
	public static void main(String[] args) {

		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		t.put(03, "xxx");
		t.put(02, "yyy");
		t.put(01, "zzz");
		Set<Integer> keys = t.keySet();
		for(Integer key : keys) {
			System.out.println(key+ " " +t.get(key));
		}


	}

}
