package com;

public class Test {
	public static void main(String[] args) {
		System.out.println("----------------START----------------------------");
		int [] a = {10,20,30,40,50};
		System.out.println(a[3]);
		
		try {
			System.out.println(a[100]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array index not found--please check");
		}
		System.out.println("---------------STOP--------------------------------");
	}

}
