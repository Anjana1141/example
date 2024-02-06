package com;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("START---------------------------------------------");
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the values  of a : ");
		int a = s.nextInt();
		
		System.out.println("enter the value of b :  ");
		int b= s.nextInt();
		
		s.close();

		/**
		 * without using try you will get error where the program will stop completely
		 * giving an error. 10/0=arithmetic exception error
		 * 
		 * by using try and catch it wont stop rather the output will be given.
		 */
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println("wrong way ");

		}


	}

}
