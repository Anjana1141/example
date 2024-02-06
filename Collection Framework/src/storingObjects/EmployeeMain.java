package storingObjects;

import java.util.LinkedList;

public class EmployeeMain {
public static void main(String[] args) {
	
	Employee e1 = new Employee(121,"xxx");
	Employee e2 = new Employee(122 , "yyy");
	Employee e3 = new Employee(123 , "jhjfh");
	
	LinkedList<Employee> l = new LinkedList<Employee>();
	l.add(e1);
	l.add(e2);
	l.add(e3);
	
	for(Employee e : l) {
		System.out.println(e);
	}
}
}
