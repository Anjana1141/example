package DefaultSorting;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	Double sal;//non primitive declaration to call compareTo()
	
	Employee(int id, String name , double sal){
		this.name=name;
		this.id=id;
		this.sal=sal;
		
		
	}
	@Override
	public String toString() {
		return "id : "+id+" name:  "+name+ "  salary : "+sal;
	}
	@Override
	public int compareTo(Employee e) {
		return this.sal.compareTo(e.sal);
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
 * note: for string comparison and double  we cannot use (-) , we have to use compareTo() of string class.
 * \
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

















