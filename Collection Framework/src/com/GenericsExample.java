package com;

import java.util.ArrayList;

public class GenericsExample {
	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("Apple");
		l.add("mango");
		l.add("banana");
		
		for(String g : l) {
			System.out.println(g);
		}
		System.out.println("----------------");
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
	}

}
