package StringDemo;

public class Demo {
	public static void main(String[] args) {

		String s = new String("A");
		System.out.println(s); //.no string representation--content is given
		System.out.println(s.toString());//.no string representation--content is given
		System.out.println("-------");

		System.out.println(s.hashCode());//ascii value of the particular letter is given not the hashcode value
		System.out.println("------------");

		String s1=new String("java");
		String s2= new String("java");

		System.out.println(s1==s2);//compares addresses
		System.out.println(s1.equals(s2));//compares content/data
	}

}
