package StringDemo;

public class MainClass {
	public static void main(String[] args) {

		String s1 = new String("java");
		System.out.println(s1);//java
		s1.concat(" program");
		System.out.println(s1);//java
		System.out.println("------------------");
		
		String s2 = new String("java");
		System.out.println(s2);//java
		s2 = s2.concat(" programming");
		System.out.println(s2);//java programming
		System.out.println("----------------------------");

	StringBuffer s3 = new StringBuffer("goood");
			System.out.println(s3);
			s3.append(" bad");
			System.out.println(s3);
			System.out.println("------------------");
			
			StringBuilder s4 = new StringBuilder("wakeup");
			System.out.println(s4);//wakeup
			s4.append(" sushma");
			System.out.println(s4);//wakeup sushma
			System.out.println("---------------------end----------------------");
			
	String s5 = new String("dabba");
	System.out.println(s5);
	s5=s5.concat("sushu aunty");
	System.out.println(s5);
	}
	

}
