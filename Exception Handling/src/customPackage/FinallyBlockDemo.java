package customPackage;

public class FinallyBlockDemo {
	public static void main(String[] args) {
		System.out.println("START------");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("invalid");
		}
		finally {
			System.out.println("inside finally block");
		}
		System.out.println();
	}
//sandeep@05
}
