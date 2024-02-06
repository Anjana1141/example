package Demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		m.put("tom", 100);
		m.put("alex",200);
		m.put("james", 300);
		
		Set<String> keys = m.keySet();//"tom" , "alex" , "james"
		
		
		for(String key : keys) {//one from many
			System.out.println("employee id of "+key+ " is "+ m.get(key));
		}
	}

}
