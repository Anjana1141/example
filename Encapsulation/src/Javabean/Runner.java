package Javabean;
import java.util.Scanner;
public class Runner {
	public static void main(String[] args) {
		Person p = new Person();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the age : ");
		int age = s.nextInt(); 
		s.close();
		p.setAge(age);
		p.getAge();
	}

}
