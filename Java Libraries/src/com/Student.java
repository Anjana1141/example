package com;

public class Student {
	int age;
	 Student(int age) {
		this.age=age;
		
	}
@Override
public String toString() {
	return "KID age is :"+age;
	
}
public static void main(String[] args) {
	Student s= new Student(22);
	System.out.println(s);
	System.out.println(s.toString());
	
}
}
