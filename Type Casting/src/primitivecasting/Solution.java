package primitivecasting;

public class Solution {
	public static void main(String[] args) {

		//widening
		int a = 25;
		double b = a;
		System.out.println(a+ "   " +b);

		double c = 45;
		System.out.println(c);
		char i = 'A';
		int d = i;
		System.out.println(d);

		System.out.println("---------------------------------------------------");

		//narrowing
		double x = 12.45;
		int y = (int)x;

		int z = (int)45.98;
		System.out.println(z);

		int p =65;
		char q= (char) p ;
		System.out.println(p+"       "+q);
		
		System.out.println((int)45.99);
		System.out.println('a'+20);
		System.out.println("a"+"b");
		System.out.println("A"+10+20);
		System.out.println(10+20+"A");
		System.out.println('A'+'B');
		System.out.println('a'+' ');
		System.out.println((int)' ');
		


	}

}
