package Demo;

import java.util.*;

public class StudentMainClass {
	public static void main(String[] args) {
		
		Student s1 = new Student(24, "pranav");
		Student s2 = new Student(21, "navya");
		Student s3 = new Student(23, "amal");
		
		LinkedHashMap<Student, Integer> l = new LinkedHashMap<Student, Integer>();
		l.put(s1, 99);//map.put(new Student(24 ,"pranav"), 99);
		l.put(s2, 98);//map.put(new Student(21 ,"navya"), 98);
		l.put(s3, 99);//map.put(new Student(23 ,"amal"), 99);
		
		Set<Student> keys = l.keySet();//s1,s2,s3
		for(Student key : keys) {
			System.out.println(key+" marks  "+l.get(key));
		}
		
	}

}
