
package sortingObject;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMainClass {
	public static void main(String[] args) {

		Employee e1 = new Employee("Alex", 6.5);
		Employee e2 = new Employee("John", 5.5);
		Employee e3 = new Employee("Jack", 7.5);
		Employee e4 = new Employee("Jill", 2.8);
		Employee e5 = new Employee("Tom", 3.3);

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);

		Collections.sort(al);
		System.out.println("employee with highest sal");
		System.out.println(al.get(al.size()-1));

		System.out.println("employee with lowest sal");
		System.out.println(al.get(0));

		System.out.println("========================");
		System.out.println("sal between 2.6 to 3.5");
		for(Employee k : al)
			if(k.sal>2.6&&k.sal<3.5) {
				System.out.println(k);


			}
		System.out.println("==============================");
		System.out.println("starts with A");
		for(Employee l :al ) {
			if(l.name.startsWith("A")) {
				System.out.println(l);
			}
		}
	}

}
