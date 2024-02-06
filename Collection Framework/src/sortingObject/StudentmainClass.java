package sortingObject;

import java.util.ArrayList;
import java.util.Collections;

public class StudentmainClass {
	public static void main(String[] args) {

		Student s1=new Student("Anju", 65);
		Student s2=new Student("Pranav", 78);
		Student s3=new Student("Amal", 89);
		Student s4=new Student("Navya", 100);
		Student s5=new Student("Sradha", 69);

		ArrayList<Student> li = new ArrayList<Student>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);

		Collections.sort(li);
		System.out.println("highest marks :");
		System.out.println(li.get(4));//(l.get()-1
		System.out.println("student with lowest mark");
		System.out.println(li.get(0));
		
		
		System.out.println("-------------------------------------------------");
		System.out.println("marks between 61 and 80");
		for(Student s : li) {
			if(s.marks>61&&s.marks<80) {
				System.out.println(s);
				
				
				
				System.out.println("---------------------------------------------");
				System.out.println("student name starting with A");
				for(Student n :li) {
					if(n.name.startsWith("A")) {
						System.out.println(n);
					}
				}

			}

		}
	}
}





