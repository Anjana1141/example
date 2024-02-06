package Javabean;

public class Solution {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("anjana");
		e.setId(4);
		int id = e.getId();
		String name = e.getName();
		System.out.println("name of the employee is  " +name + " id is : " +id);
	}

}
