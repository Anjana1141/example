package org;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class MainClass {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(20);
		l.add(30);
		l.add(5);
		l.add(2);
		l.add(10);
		
		System.out.println(l);//[20, 30, 5, 2, 10]
		Collections.sort(l);
		System.out.println(l);//[2, 5, 10, 20, 30]
		Collections.reverse(l);
		System.out.println(l);//[30, 20, 10, 5, 2]
		System.out.println("----------------------------");
		LinkedList al = new LinkedList();
		al.add(10);
		al.add(1.3);
		al.add("java");
		
		System.out.println(al);
		//Collections.sort(al);
		//System.out.println(al);//Exception in thread "main" java.lang.ClassCastException.
		Collections.reverse(al);
		System.out.println(al);//[java, 1.3, 10]
		

	}

}
