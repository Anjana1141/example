package com;
import java.util.*;
public class Example {
	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		l.add(20);
		l.add(30);
		l.add(50);
		l.add(70);

		LinkedList ll=new LinkedList();
		ll.addAll(l);
		ll.add(100);

		System.out.println(ll.containsAll(l));
		System.out.println(ll);
		ll.removeAll(l);
		System.out.println(ll);









	}

}
