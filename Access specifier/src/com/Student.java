package com;
//accessing public class members in same class
public class Student {
	public static int id = 101;
	public String name = "TOM";
	
	public void study() {
		System.out.println("studying java");
		
	}
	public static void main(String[] args) {
		System.out.println("id : " + id); //can also use student.id
		
		Student s = new Student();
		System.out.println("name : " +s.name);
		s.study();
	}
	
}
