package com;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		System.out.println("employee details : ");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter employee name : ");
		String name = scan.next();
		
		System.out.println("enter the age : ");
		int age = scan.nextInt();
		
		System.out.println("enter the gender  : ");
		int gender = scan.nextInt();
		
		System.out.println("enter the salary : ");
		double sal = scan.nextDouble();
		
		System.out.println("name is " + name + " age is " +age + " gender is "  +gender + "salary earned is " +sal );
		
		
	}

}
