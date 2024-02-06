package StringDemo;

public class Student {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s); //---string representation
		System.out.println(s.toString()); //string representation
		System.out.println("-------------------");
		System.out.println(s.hashCode());//string representation
		System.out.println("--------------------");
		
		
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1 == s2);//reference variable
		System.out.println(s1.equals(s2)); //string representation checking
	}

}
