package customPackage;

import java.util.Scanner;

public class Login {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the password : ");
	int password=s.nextInt();
	s.close();
	
	if(password==123) {
		System.out.println("valid password");
	}
	else {
		try {
			throw new InvalidPasswordException("invalid password") ;
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
}
/*
 * line 17 can be written
 * InvalidPasswordException obj = new InvalidPasswordException("invalid password");
 * throws obj;
 * 
 */
