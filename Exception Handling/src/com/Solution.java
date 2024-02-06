package com;

public class Solution {
	public static void main(String[] args) {
		System.out.println("START");
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("END------------------------------------------------");
	}

}
