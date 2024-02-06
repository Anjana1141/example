package com;

import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {
		ArrayList l =new ArrayList();
		l.add(15);
		l.add("programming");
		l.add(35);
		for(int i=0;i< l.size(); i++) {
			System.out.println(l.get(i));
		}
		for(int j=l.size()-1; j>=0;j--) {
			System.out.println(l.get(j));
		
		}
	

	
	}

}
