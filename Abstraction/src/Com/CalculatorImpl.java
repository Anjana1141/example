package Com;

public class CalculatorImpl extends Calculator { //------RULE 2 (IS-A-RELATIONSHIP)

	@Override
	 void add(int x , int y) {   //-------RULE 3 (OVERRIDE)
		int sum = x+y;
		System.out.println("sum of " +x+" & "+y+ " is " + sum);


	}
	void multiply(int x, int y) {
		int product=x*y;
		System.out.println("product of " +x+ " & " +y+ " is " + product);
	}


}
