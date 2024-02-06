package com;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		//internally an array gets created based on default initial  capacity(10)
		ArrayList a = new ArrayList();
		
		
		//internally an array gets created based on custom initial capacity(20)
		ArrayList b = new ArrayList(20);
		  
		
		ArrayList x = new ArrayList();
		x.add("rrr");
		x.add("ttt");
		
		//adding 1 collection into another collection using constructor 
		ArrayList y = new ArrayList(x);
		y.add(30);
		System.out.println("x : " +x);//[rrr, ttt]
		System.out.println("y : "+y);//y : [rrr, ttt, 30]
		
		
	}

}
