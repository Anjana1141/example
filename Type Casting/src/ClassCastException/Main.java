package ClassCastException;

public class Main {
	public static void main(String[] args) {
		
		Father f = new Father();
		Son s= new Son();
		Daughter d = new Daughter();


		System.out.println("s instance of ::-------------------");
		System.out.println( s instanceof Son);
		System.out.println( new Son() instanceof Son);
		System.out.println(f instanceof Son);

		System.out.println("daughter instance of----------------");
		System.out.println(f instanceof Daughter);
		System.out.println(d instanceof Daughter);
		System.out.println(d instanceof Father);




	}


}
