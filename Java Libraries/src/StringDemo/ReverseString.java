package StringDemo;

public class ReverseString {
	public static void main(String[] args) {
		String s = "software engineer";
		char[] ch =s.toCharArray();
		for(int i =  ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);//reverse string
			//System.out.print(ch[i]);//in the same line
		}
	}

}
