package traversingDemo;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(2.3);
		al.add(4.3);
		al.add(true);
		al.add(null);
		al.add("java");
		
		for(Object obj : al) {
			if(obj instanceof Integer) {
			System.out.println(obj);
		}
		
	}

}
}
