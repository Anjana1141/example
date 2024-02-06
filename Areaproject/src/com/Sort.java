package com;

import java.util.Scanner;
class Sort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter three number :      ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		int lar=a>b&&a>c?a:(b>c?b:c);
		int sml=a<b&&a<c?a:(b<c?b:c);
		int sum=a+b+c;
		int slar=sum-(lar+sml);
		System.out.println(sml+ " " +slar+" " +lar);
	}

}
