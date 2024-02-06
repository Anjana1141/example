package com;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value : ");
		int n= sc.nextInt();
		countDigit(n);
		sc.close();
		
	}
public static void countDigit(int n) {
	int count=0;
	do {
		count++;
		n=n/10;
		
	}while(n!=0);
	System.out.println("count of  digit : " +count);
	
	}
}

