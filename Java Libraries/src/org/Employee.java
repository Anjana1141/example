package org;

public class Employee {
	String name;
	int salary;

	Employee(String name , int salary){
		this.name=name;
		this.salary=salary;
	}
	public boolean equals(Object obj) {
		Employee e2 = (Employee) obj;
		return this.name.equals(e2.name) &&  this.salary==e2.salary;
		/**--------------when string is there we cannot use == instead use 
		 *equals().-------------------
		 */
	}

}
