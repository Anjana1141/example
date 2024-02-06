package Demo;

import java.util.HashMap;
import java.util.Map;

public class Example {
	public static void main(String[] args) {
		
		Map map = new HashMap();
		map.put(10, "java");
		map.put("apti", 11.2);
		map.put(null, 23);
		map.put(37.5, 55);
		
		System.out.println(map);//{null=23, 37.5=55, apti=11.2, 10=java}
		System.out.println(map.get(10));//java
		System.out.println(map.get(20));//null
		System.out.println(map.containsValue("java"));//true
		System.out.println(map.containsValue("Java"));//false
		System.out.println("------------");
		
		
		System.out.println(map);//{null=23, 37.5=55, apti=11.2, 10=java}
		map.remove(10);
		System.out.println(map);//{null=23, 37.5=55, apti=11.2}
		System.out.println("----------------");
		
		System.out.println(map.isEmpty());//false
		map.clear();
		System.out.println(map.isEmpty());//true
	}

}
