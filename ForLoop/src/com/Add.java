package com;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value................... ");
		int x = s.nextInt();
		sum(x);
		product(x);
		System.out.println("end.....");
		s.close();

	}
	public static void sum(int n) {
		int sum=0;
		for(int i =1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("sum : "+sum);
	}


	public static void product(int n) {
		int pro=1;
		for(int i =1; i<=n;i++) {
			pro*=i;

		}
		System.out.println("product of the number ..." +pro);
	}

}
