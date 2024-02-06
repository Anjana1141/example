package ClassCastException;

public class MainClass {
	
	static void display(Employee obj) {
		
		if(obj instanceof Developer) {
			Developer d = (Developer)obj;
			System.out.println(d.cname);
			d.develop();
		}
		else if(obj instanceof Tester) {
			Tester t = (Tester)obj;
			System.out.println(t.cname);
			t.test();
			
		}
	}
	public static void main(String[] args) {
		Developer d = new Developer();
		display(d);
		//display(new Developer());
		Tester t= new Tester();
		display(t);
		//display(new Tester());
	}

}
