package DefaultSorting;

public class Person  implements Comparable<Person>{

	int age;
	String name;

	Person(int age,String name){//abcdefghijklmnop
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "the age of " +name+ " is " +age;
	}
	public int compareTo(Person p) {
		return this.name.compareTo(p.name);
	}

}
/**
 * Sorting based on age(int):
 * 1.Ascending order-> return this.age-p.age;
 * 2.descending order->retrun p.age-this.age;
 * 
 * Sorting based on names
 * 1.Ascending order - this.name.compareTo(p.name);
 * 2.descending order->p.name.compareTo(this.name);
 * 
 * this -> current object to be inserted 
 * p-> already existing object.
 * 
 * note: for string comparison we cannot use (-) , we have to use compareTo() of string class.
 * \
 * 
 * * 
 * 
 */



