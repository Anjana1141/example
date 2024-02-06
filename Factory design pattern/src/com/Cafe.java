package com;

import java.util.Scanner;

class Cafe {
	static Beverage order (int choice) {
		if(choice==1) {

			return new Coffee();
		}
		else if(choice==2) {
			return new Tea();
		}
		else {
			return null;
		}

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1:coffee\n2:tea\n:enter choice :");
		int choice=s.nextInt();
		s.close();
		Beverage obj=order(choice);
		if(obj instanceof Coffee) {
			System.out.println("drinking coffee");
		}
		else if(obj instanceof Tea) {
			System.out.println("drinking tea");
		}
		
		else {
			System.out.println("invalid choice");
		}
	}

}
