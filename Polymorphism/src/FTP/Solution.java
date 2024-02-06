package FTP;

public class Solution {

	/**generalization
	 * 1.Employee obj = new developer();
	 * 2.Employee obj = new tester();
	 * 
	 */
	static void display(Employee obj) {
		obj.work();
	}

	public static void main(String[] args) {

		display(new Developer());
		display(new Tester());		
	System.out.println("-------------------");	

		//------------upcasting using separate reference--------------------
		Employee e = new Developer();//rule 3 upcasting
		e.work();
		Employee e1 = new Tester();
		e1.work();

		System.out.println("--------------------------------------");
		//---------------------upcasting using same reference-----------------
		Employee emp;
		emp = new Developer();
		emp.work();
		emp=new Tester();
		emp.work();

	}
}
