package example;

public class Student {
	String name;
	int marks;

	Student(String name, int marks){
		this.name=name;
		this.marks=marks;
	}
	public String toString() {
		return "name : " +name+ "    marks : "+marks ;
	}

}
