package Nonprimitivecasting;

public class MainClass {
	public static void main(String[] args) {
		
		//upcasting
		Father f = new Son();
		System.out.println(f.name);//cannot take age bcz of visibility
		
		//downcasting
		Son s = (Son) f;
		System.out.println(s.name+"   "+s.age);
		
	}

}
