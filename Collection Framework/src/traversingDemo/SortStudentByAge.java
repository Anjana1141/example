package traversingDemo;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student> {
	
	public int compare(Student s , Student y) {
		return s.age-y.age;
	}

}
