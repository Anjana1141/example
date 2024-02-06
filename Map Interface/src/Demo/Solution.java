package Demo;

import java.util.LinkedHashMap;
import java.util.Set;


public class Solution {
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> li = new LinkedHashMap<Integer, String>();
		li.put(1, "xxx");
		li.put(2, "yyy");
		li.put(3, "zzz");
		
		Set<Integer> keys = li.keySet();// 1, 2, 3
		for(Integer key : keys) {
			System.out.println(key+" -> "+li.get(key));
		}
	}

}
