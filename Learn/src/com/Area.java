package com;


import java.util.Scanner;

class Area{
	final static double pi = 3.14;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the value of radius r :");
		int r=s.nextInt();
		s.close();
		double area=2*pi*r*r;
		double circumference=2*pi*r;
		System.out.println("area : "+area);
		System.out.println("circumference : "+circumference);
	}
}
