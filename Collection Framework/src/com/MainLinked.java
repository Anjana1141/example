package com;

import java.util.LinkedList;

public class MainLinked {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("java");
		l.add(10);
		l.add(10);
		l.add(null);
		l.add(true);
		
		
		System.out.println(l);//[10, java, 10, 10, null, true]
		System.out.println(l.size());//6
		System.out.println(l.indexOf(10));//0
		System.out.println(l.lastIndexOf(10));//3
		
	}

}
