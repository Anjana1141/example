package com;
import java.util.Scanner;
class Addition {
	static void add(int x,int y)
	{
		int sum = x+y;
		System.out.println("sum of x and y is " +sum );
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println(" enter the value of x : ");
		int x = s.nextInt();
		
		System.out.println("enter the value of y  : ");
		int y = s.nextInt();
		s.close();
		add(12,13);
		Addition.add(x,y);
		
		
	
	}
}
