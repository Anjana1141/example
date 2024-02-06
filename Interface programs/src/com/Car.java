package com;

public class Car implements Vehicle {
	public void start() {
		System.out.println("drive safely ");
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.start();


	}


}
