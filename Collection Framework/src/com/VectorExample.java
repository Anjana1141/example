package com;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(10);
		v.add(20.5);
		v.add("vishnu");
		v.add("pottan");

		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		System.out.println("-----------------------------------------");
		for(int j=v.size()-1;j>=0;j--) {
			System.out.println(v.get(j));
		}
	}

}
