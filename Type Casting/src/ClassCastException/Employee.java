package ClassCastException;

public class Employee {
	String cname= "sushma";
//becareful wih bracketsssssss----------------------------
}
class Developer extends Employee{
	void develop() {
		System.out.println("not working");
		
	}
}
	class Tester extends Employee{
		void test() {
			System.out.println("lazy fellow");
		}
	}
