package com;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(23.5);
		l.add(10);
		l.add("java");
		l.add(null);
		
		
		System.out.println(l);//[10, 23.5, 10, java, null]
		System.out.println(l.get(1));//23.5
		System.out.println(l.size());//5
		System.out.println(l.contains("java"));//true
		System.out.println(l.contains("Java"));//false
		System.out.println("------------------------------------------");
		
		System.out.println(l);//[10, 23.5, 10, java, null]
		l.remove(2);
		System.out.println(l);//[10, 23.5, java, null]
		System.out.println("-----------------------------------");
		
		System.out.println(l.isEmpty());//false
		l.clear();
		System.out.println(l.isEmpty());//true
		
	}

}
