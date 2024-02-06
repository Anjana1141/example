package com;

public class Tom extends Employee {
	@Override
	void work() {
		System.out.println("tom is working");
	}
	public static void main(String[] args) {
		Tom t = new Tom();
		t.work();
	}
	

}
