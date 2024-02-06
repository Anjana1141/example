package com;

public class Customer extends Swiggy {
	void orderFood() {
		System.out.println("briyani");
	}
	void pay() {
		System.out.println("payment processing");
	}
	public static void main(String[] args) {
		Customer c = new Customer();
		c.orderFood();
		c.pay();
	}
}
