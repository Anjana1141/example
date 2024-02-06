package com;

import java.util.Scanner;

public class Triangle {

	void area(int a , int b) {
		System.out.println("result successful");
	}

	public static void main(String[] args) {
		Triangle t = new Triangle();
		Scanner s = new Scanner(System.in);
		System.out.println("first triangle---------------------------------");
		System.out.println("ENTER THE VALUE OF A : ");
		int a = s.nextInt();
		System.out.println("enter the value of b : ");
		int b = s.nextInt();
		double area = 0.5*a*b;
		System.out.println("area of the triangle : " +  area );


		//second triangle 
		System.out.println("the second triangle : --------------------------");
		System.out.println("ENTER THE VALUE OF A : ");
		int length = s.nextInt();
		System.out.println("enter the value of b : ");
		int breadth = s.nextInt();
		double area1 = 0.5*length*breadth;
		System.out.println("area of the triangle : " +  area1 );


		//third triangle
		System.out.println("the third triangle---------------------------------");
		System.out.println("ENTER THE VALUE OF A : ");
		int a1 = s.nextInt();
		System.out.println("enter the value of b : ");
		int b2 = s.nextInt();
		double area2=0.5*a1*b2;
		System.out.println("area of the triangle : " +  area2 );
		s.close();
		//System.out.println("area of triangle : " + 0.5*(a*b));
		double avg=(area+area1+area2)/3;
		System.out.println("avg : " +avg);
		t.area(a, b);

	}





}
