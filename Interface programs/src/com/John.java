package com;

public class John extends Student implements Jspiders, Qspiders {
	@Override
	void study() {
		System.out.println("john is studying java");
	}
	public void testApp() {
		System.out.println("testing app");

	}
	public void developApp() {
		System.out.println("java programming");
	}
	public static void main(String[] args) {
		John j = new John();
		j.developApp();
		j.testApp();
	}
	

	
}
