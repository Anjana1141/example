package customSorting;

import java.util.Comparator;

public class SortStudentByMarks implements Comparator<Student> {
	
	@Override
	public int compare(Student s , Student t ) {
		return s.marks-t.marks;
	}
	

}
//x--> current object to be inserted
//y -> already existing object

