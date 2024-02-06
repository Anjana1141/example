package customSorting;

import java.util.TreeSet;

public class StudentMainClass {
	public static void main(String[] args) {

		Student s1 = new Student(21, 95);
		Student s2 = new Student(22, 92);
		Student s3 = new Student(20, 96);


		SortStudentByAge age = new SortStudentByAge();
		SortStudentByMarks  marks = new  SortStudentByMarks();
		TreeSet<Student> t = new TreeSet<Student>(marks);
		//TreeSet<Student> t = new TreeSet<Student>(new SortStudentByMarks());
		t.add(s1);//
		t.add(s2);
		t.add(s3);

		for(Student s : t) {
			System.out.println(s);
		}
	}

}
