package com;

public class Citizen implements State{
	public void electCm() {
		System.out.println("cm elected : ");
	}
	public void electPm() {
		System.out.println("pm elected ");
	}
	public static void main(String[] args) {
		Citizen c = new Citizen();
		c.electCm();
		c.electPm();
	}
}


