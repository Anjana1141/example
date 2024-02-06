package org;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(200);
		l.add(400);
		for(Integer i : l) {
			System.out.println(i);
		}
		System.out.println("-------------------------");
		LinkedList<Double> d = new LinkedList<Double>();
		d.add(10.3);
		d.add(39.6);
		d.add(43.76);
		for(double x : d) { //for(Double x : d)
			System.out.println(x);
		}
		System.out.println("--------------");
		ArrayList n = new ArrayList();
		n.add(10);//n.add(new Integer(10));
		n.add("programming");//n.add(new Double(1.2));
		n.add(49.0);//n.add(new Character('z'));,
		for(Object h : n) {
			System.out.println(h);
		}
	}

}