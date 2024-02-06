package Javabean;
import java.util.Scanner;
public class User {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Instagrm i = new Instagrm();
		System.out.println(" enter the email : ");
		String email = s.next();
		i.setEmail(email);
		System.out.println(i.getEmail());


		System.out.println("enter the password : ");
		String password=s.next();
		s.close();
		i.setPassword(password);
		
		System.out.println(i.getPassword());


	}

}
