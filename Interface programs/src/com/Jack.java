package com;

public class Jack implements Employee {
	
	@Override
	public void work() {
		System.out.println("jack is working");
	}
public static void main(String[] args) {
	Jack j = new Jack();
	System.out.println("id of the employee is : " +Employee.id);
	j.work();
	
}
}
