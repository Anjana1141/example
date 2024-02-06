package FTP;

public class MainClass {
	static void display(Vehicle v) {
		v.travel();
	}
	public static void main(String[] args) {
		 // generalization
		
		display(new Car());
		display(new Bus());
		display(new Bike());
		
		System.out.println("------------------------------------");
		//upcasting in same variable
		Vehicle v;
		v= new Car();
		v.travel();
		v= new Bike();
		v.travel();
		v= new Bus();
		v.travel();
		
		
		System.out.println("------------------------------");
		//upcasting in separate reference name
		  
		 Vehicle v1=new Car();
		 Vehicle v2 = new Bike();
		 Vehicle v3 = new Bus();
		 v1.travel();
		 v2.travel();
		 v3.travel();
	}

}
