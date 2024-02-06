package com;

import java.util.*;

public class MethodDemo {
	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		l.add(20);
		l.add(30);
		
		LinkedList ll=new LinkedList();
		ll.add(l); //ll.addAll(l);
		ll.add(100);
		
		System.out.println("LL:"+ll+"   size: "+ll.size());//LL:[[20, 30], 100]   size: 2

}
}
/***
 * Documentation Comment
 * 1.ll.addAll(l);---Adding all the objects of 1 collection into another Collection 1 by 1
 * 
 * 2.  ll.addAll(l);-----Adding all the objects of 1 collections into another 
 * collection as a single object
 * 
 
 * */


















