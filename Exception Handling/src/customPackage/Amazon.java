package customPackage;

import java.util.Scanner;



public class Amazon {
static void checkEligibility(int marks) throws InvalidMarksException{
	if(marks>=60) {
		System.out.println("APPLY FOR INTERVIEW");
	}
	else {
		String message="not eligible";
		throw new InvalidMarksException(message);
		
	}
	
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the marks : ");
	int marks = s.nextInt();
	try {
		checkEligibility(marks);
	}
	catch(InvalidMarksException e) {
		System.out.println(e.getMessage());
	}
}

}
