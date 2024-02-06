package com;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n=s.nextInt();
	s.close();
	for(int i=1;i<=n;i++) {
		int pro=1;
		for(int j =1;j<=i;j++) {
			pro*=j;
			
		}
		System.out.println("factorial of "+i+" : "+pro);
	}
	
}
}
