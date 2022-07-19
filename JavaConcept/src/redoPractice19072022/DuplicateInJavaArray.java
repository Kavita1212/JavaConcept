package redoPractice19072022;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateInJavaArray {

	public static void main(String[] args) {
		String[] arr={"java","javaScript","Ruby","c","python","java"};
		
		
		Map<String,Integer> m = new HashMap<String,Integer>();
		for (String i : arr) {
			if(m.containsKey(i)) {
				m.put(i, m.get(i)+1);
			}
			else {
				m.put(i, 1);
			}
		}
		for (Entry<String, Integer> e : m.entrySet()) {
			if(e.getValue()>1) {
				System.out.println(e.getKey() +" : "+e.getValue());
			}
			
		}
		

	}

}
