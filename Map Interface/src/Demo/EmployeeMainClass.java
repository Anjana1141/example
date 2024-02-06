package Demo;
import java.util.*;
public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee(100);
		Employee e2 = new Employee(200);
		Employee e3 = new Employee(150);
		
		TreeMap<Employee, String> t = new TreeMap<Employee, String>();
		t.put(e1, "Amal");
		t.put(e2, "Pranav");
		t.put(e3, "Navya");
		
		Set<Employee> keys = t.keySet() ;
		for(Employee key : keys) {
			System.out.println(key+ " name : " +t.get(key));
		}
		
	}

}
