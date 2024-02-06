package comm;

public class Student {
	int age;// 0--22
	String name;//null--tom
	
	Student(int age){
		this.age=age;
				
	}
	Student(int age, String name){
		this(age); //this.age=age will be redundancy
		this.name=name;
		
	}
	public static void main(String[] args) {
		Student s= new Student(22, "tom");
		System.out.println("age :" + s.age);
		System.out.println("name : " + s.name);
	}

}
