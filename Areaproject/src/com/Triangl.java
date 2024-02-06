package com;

import java.util.Scanner;

public class Triangl {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter b and h : ");
		double b1 = s.nextDouble();
		double h1 = s.nextDouble();
		double a1 = areaCalculation(b1 ,h1);
		
		System.out.println("enter b2 and h2 : ");
		double b2 = s.nextDouble();
		double h2 = s.nextDouble();
		double a2 = areaCalculation(b2,h2);
		
		
		
	}
	public static double  areaCalculation(double base ,  double height) {
		
		double area = 0.5 * base*height;
		
		return area;
	}

}
