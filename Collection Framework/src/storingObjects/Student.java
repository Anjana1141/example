package storingObjects;

public class Student {
	
	int age;
	
	Student(int age){
		this.age=age;
	}
	@Override
	public String toString() {
		return "Age : "+age;
	}

}
