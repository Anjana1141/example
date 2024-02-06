package Com;

public class MainClass {
	public static void main(String[] args) {

		//upcasting
		Calculator calc = new CalculatorImpl();
		calc.add(5, 355);
		calc.multiply(56, 65);


		//normal
		CalculatorImpl cal = new CalculatorImpl();
		cal.add(5, 6);
		cal.multiply(56, 78);
	}

}
