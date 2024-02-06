package sortingObject;

public class Employee implements Comparable<Employee> {
	String name;
	Double sal;

	Employee(String name,double sal){
		this.name=name;
		this.sal=sal;
	}
	public String toString() {
		return "the salary of the employee : "+name+" is "+sal;
	}
	public int compareTo(Employee e) {
		return this.sal.compareTo(e.sal);
	}

}
