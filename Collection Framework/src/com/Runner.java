package com;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(40);
		
		System.out.println(l);//[10, 20, 40]
		l.add(1,55);
		System.out.println(l);//[10, 55, 20, 40]
		l.set(2, 27);
		System.out.println(l);//[10, 55, 27, 40]
		
	}

}
