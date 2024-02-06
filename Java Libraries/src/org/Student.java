package org;

public class Student {
	int age;
	
	Student(int age){
		this.age=age;
	}
	@Override
	public boolean equals(Object obj) {  // 1.upcasting
		Student s2= (Student) obj;       //2.downcasting
		return this.age==s2.age;         //3. comparison logic s1.age==s2.age
	}
public static void main(String[] args) {
	Student s1 = new Student(20);
	Student s2 = new Student(20);
	System.out.println(s1.equals(s2)); //false
	//s1.equals(new Student(20))
}
}
//s1 -> this
//s2 -> obj ->s2

