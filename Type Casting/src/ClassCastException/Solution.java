package ClassCastException;

public class Solution {
	
	//generalization
	//1.display(new son());-- father obj=new son();
	//2.display(new daughter());--- father obj = new daughter();
	
	static void display(Father obj) {
		if(obj instanceof Son) {
			System.out.println("downcasting to Son -----------------------------");
			Son s = (Son)obj;
			System.out.println(s.x+"   "+s.y);
		}
		else if(obj instanceof Daughter) {
			System.out.println("downcasting to Daughter-----------------------");
			Daughter d = (Daughter) obj ;
			System.out.println(d.x+"  "+d.z);
			
			
		}
		
	}
	public static void main(String[] args) {
		display(new Son());
		display(new Daughter());
		
	}

}
