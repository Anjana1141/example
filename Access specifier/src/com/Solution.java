package com;
//accessing public members in different class

public class Solution {
	public static void main(String[] args) {

		Employee emp = new Employee();
		System.out.println("sal of " + emp.name + "is " + emp.sal + "LPA");
		Employee.work();
	}

}
