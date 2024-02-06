package com;

public class ForEach {
	public static void main(String[] args) {

		int[] a = {10,30,40};
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int  b : a) {
			System.out.println(b);
		}
		double[] marks= {50.5,60.5,70.8};
		for(double m : marks) {
			System.out.println(m);
		}
		String[] fruits = {"apple","mango","grapes"};
		for(String f : fruits) {
			System.out.println(f);
		}
	}

}
