package checkedAndUnchecked;

public class UncheckedExample {
	public static void main(String[] args) {
		 int[]a= {10,20,30}; //we are not handling it immediately 
		 //therefore unchecked exception
		 System.out.println(a[99]);
		 
		 System.out.println(10/0);//unchecked no immediate handling
		 
	}

}
