package com;
/**
 * only one Exception at a time so which id first will be executed 
 * not the super class (if super class is first it will be executed)
 */

public class Example {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid");
		}
		catch(ArithmeticException e) {
			System.out.println("denominator invalid");
		}
		catch(Exception e){
			System.out.println("super class catch block");

		}
	}

}
