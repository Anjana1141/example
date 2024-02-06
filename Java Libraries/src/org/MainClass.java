package org;

public class MainClass {


	public static void main(String[] args) {
		Car c1 = new Car(50000);
		Car c2 = new Car(20000);
		System.out.println(c1.equals(c2));


		if(c1.equals(c2)) {
			System.out.println("cost is same");

		}
		else
		{
			System.out.println("cost id different");
		}


	}

}
//upcasting is achieved during equals()
//c1 -> this
//c2 -> obj(upcasted reference) -> c2(downcasted reference)
//upacsting is achieved only when call equals().