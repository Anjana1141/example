package com;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		System.out.println("addition---");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the first number :");
		int x = scan.nextInt();
		System.out.println("enter the second number : ");
		int y = scan.nextInt();
		scan.close();
		
		int sum = x + y;
		System.out.println("sum = " +sum);
		
		System.out.println("result done");
		
		
	}

}
