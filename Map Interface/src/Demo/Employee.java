package Demo;

public class Employee implements Comparable<Employee> {
	int id;

	public Employee(int id) {
		this.id=id;
	}
	public String toString() {
		return "id : " + id;
	}
	@Override
	public int compareTo(Employee e) {
		return this.id-e.id;
	}
}
//this-> current object to be inserted
//e-> already existing object.



