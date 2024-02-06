package Javabean;

public class Person {
	private int age;

	public void setAge(int age) {
		if(age>0) {
			this.age=age;
			System.out.println("age is initialized");
		}
		else {
			System.out.println("invalid");
		}
	}
	public int getAge() {
		return age;
	}

}
