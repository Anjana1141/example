package DefaultSorting;

import java.util.TreeSet;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p1 = new Person(21, "Amal");
		Person p2 = new Person(22,"Pranav");
		Person p3 = new Person(23, "Navya");
		
		TreeSet<Person> t = new TreeSet<Person>();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		
		for(Person p : t) {
			System.out.println(p);
		}
		
	}

}
