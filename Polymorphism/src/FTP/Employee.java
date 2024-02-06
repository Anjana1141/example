package FTP;

public class Employee {
	void work() {
		System.out.println("employe is Working ");
	}

}
class Developer extends Employee{ //rule 1 inheritance
	void work() {                  // rule 2 overriding
		System.out.println("developing app");
	}
}
class Tester extends Employee{
	void work() {
		System.out.println("testing app");
	}
}