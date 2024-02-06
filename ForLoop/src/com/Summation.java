package com;
import java.util.Scanner;
public class Summation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("enter the vales......");
		int n=s.nextInt();
		sum(n);
		s.close();

	}
	public static void sum(int n) {
		int sum=0;
		sum=n%10;
		n=n/10;
		while(n>9) {
			n=n/10;
		}
		sum=sum+n;
		System.out.println("sum :" +sum);
		
	}
}