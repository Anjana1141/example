package traversingDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("========");
		for(Integer l :al) {
			System.out.println(l);
		}
		System.out.println("============================");
		//Iterator-----------------------------------------------🙌🙌🙌🙌
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
