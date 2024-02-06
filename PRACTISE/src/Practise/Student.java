package Practise;

public class Student {
	Student(int age){
		this(6.0);
		
		System.out.println("age   : " +age);
	}
	Student(String name){
		this("po10");

		System.out.println("name   : " +name);
	}
Student(double height){
	this("po10");
	System.out.println("height   : " +height);
}
public static void main(String[] args) {
	Student s = new Student(8);
	
}

}
