package org;

public class EmpMain {
	public static void main(String[] args) {
		Employee e1 = new Employee("anjana",1500000);
		Employee e2 = new Employee("anjana" ,1500000);
		System.out.println(e1.equals(e2));
	}

}
