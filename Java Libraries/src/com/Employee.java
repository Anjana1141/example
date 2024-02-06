package com;

public class Employee {
	int id;
	String name;
	
	Employee(int id , String name){
		this.id=id;
		this.name=name;
	}//without this the reference variable value will be given 
	@Override
	public String toString(){
return "Emp id of " +name + " is " + id ;		
	}
	public static void main(String[] args) {
		Employee e = new Employee(42,"Tom");
		Employee e2 = new Employee(53,"Alex");
		System.out.println(e);
		System.out.println(e2.toString());
		
	}

}
