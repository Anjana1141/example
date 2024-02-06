package example;

public class MainClass {
	public static void main(String[] args) {
		Car c1= new Car("BMW","BLUE",3000000);
		Car c2 = new Car("AUDI","BLUE",78299990);

		Car[]c = { c1,c2};
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}

	}
}
