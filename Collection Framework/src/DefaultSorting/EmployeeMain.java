package DefaultSorting;

import java.util.TreeSet;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(100,"Tom",2.5);
		Employee e2 = new Employee(101,"Jill",2.6);
		Employee e3 = new Employee(102,"Jack",3.7);
		
		TreeSet<Employee> t = new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		for(Employee e : t) {
			System.out.println(e);
		}
	}

}
