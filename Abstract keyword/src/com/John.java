 package com;

public class John  extends Uber{
	@Override
	void makePayment() {
System.out.println("payment processing");		
	}
	void bookCab() {
		System.out.println("BOOKED CAB");
		
	}
	public static void main(String[] args) {
		John j = new John();
		j.bookCab();
		j.makePayment();
	}
}
