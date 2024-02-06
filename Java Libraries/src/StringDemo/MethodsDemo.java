package StringDemo;

public class MethodsDemo {
	public static void main(String[] args) {
		String s = "Software engineer";
		System.out.println(s.length());//check the length---17
		System.out.println(s.toLowerCase());//convert to lowercase
		System.out.println(s.toUpperCase());//covert to uppercase
		System.out.println(s.startsWith("soft"));//case sensitive---false
		System.out.println(s.startsWith("Soft"));//true
		System.out.println(s.endsWith("eer"));//true
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('e'));
		System.out.println(s.contains("ware"));
		String x ="java";
		String y ="java";
		String z = "JAvA";
		System.out.println(x.equals(y));
		System.out.println(x.equals(z));
		System.out.println(x.equalsIgnoreCase(z));


		System.out.println("------------------------------------------------");


		String a ="Hello world";
		System.out.println(a.substring(3));//lo world
		System.out.println(a.substring(6));	
		System.out.println(a.substring(2, 8));
		//System.out.println(s.toCharArray());
		char[] ch =s.toCharArray();
		for(int i =  ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);//reverse string
			System.out.print(ch[i]);//in the same line
		}
	}
}


