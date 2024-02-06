package storingObjects;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		
		Student s1= new Student(21);
		Student s2 = new Student(23);
		
		ArrayList<Student> l = new ArrayList();
		l.add(s1);
		l.add(s2);
		
		for(Student s : l) {
			System.out.println(s);
		}
		System.out.println("=============");
		for(int i = 0; i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}

}
