package Demo;

public class Student {
	int age;
	String name;

	Student(int age, String name){
		this.age=age;
		this.name=name;
	}
	public String toString() {
		return "name : " + name + " age : "+ age;
	}

}
