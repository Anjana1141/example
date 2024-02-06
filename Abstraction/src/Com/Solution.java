package Com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Bank b=new BankImpl(); //upcasting

		b.checkBalance();
		System.out.println("-------------");


		System.out.println("enter the amount");
		int amountToDeposit=s.nextInt();
		b.deposit(amountToDeposit);
		b.checkBalance();
		System.out.println("------------------");


		System.out.println("enter the amount withdrawed");
		int withdraw=s.nextInt();
		b.withdraw(withdraw);
		b.checkBalance();
		s.close();



	}

}
