package traversingDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentMainClass {
	public static void main(String[] args) {
		
		List<Student> l = new ArrayList<Student>();
		l.add(new Student(22));
		l.add(new Student(23));
		l.add(new Student(21));
		
		System.out.println("before sorting=======");
		Iterator<Student> itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("After sorting ====");
		Collections.sort(l , new SortStudentByAge());
		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		
	}

}
}
