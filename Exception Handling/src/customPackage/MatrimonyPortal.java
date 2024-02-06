package customPackage;

import java.util.Scanner;

public class MatrimonyPortal {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the age : ");
		int age = s.nextInt();
		s.close();
		if(age>=21) {
			System.out.println("get married , if u get a pair");
		}
		else {
			try {
				throw new AgeInvalidException("y so hurry!!!!");
			}
			catch(AgeInvalidException e){
				System.out.println(e.getMessage());
				
			}
		}
	}

}
