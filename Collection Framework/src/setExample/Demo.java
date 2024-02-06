package setExample;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add("java");
		hs.add(null);
		
		System.out.println("size : "+hs.size());//size : 4 duplication not allowed
		for(Object obj : hs) {
			System.out.println(obj);
		}
		System.out.println("--------------");
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();//insertion order maintained 
		lhs.add(20);
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		System.out.println(lhs.size()+ " size ");
		for(int i : lhs) {
			System.out.println(i);
		}
	}
	
		
	}


