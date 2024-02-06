package customSorting;

public class Student {
	int age;
	int marks;
	
	Student(int age, int marks) {
		this.age=age;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "age : " +age+ "   Marks : "+marks;
	}
	

}
