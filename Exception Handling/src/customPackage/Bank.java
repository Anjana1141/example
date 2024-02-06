package customPackage;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		int balance=10000;
		Scanner s= new Scanner(System.in);

		System.out.println("enter the amount to be withdrawn : ");
		int amount=s.nextInt();
		s.close();

		if(amount<=balance) {
			System.out.println("amount withdrawn successfully---");
		}
		else
			try {
				throw new InsufficientBalanaceException("insufficent amount");
			}
		catch(Exception e ) {
			System.out.println(e.getMessage());
		}
	}	

}
