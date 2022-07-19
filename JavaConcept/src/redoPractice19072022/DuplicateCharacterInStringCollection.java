package redoPractice19072022;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacterInStringCollection {

	public static void main(String[] args) {
		String s ="ajeetgt";
		
		char[] ch = s.toCharArray();
		
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		for (Character i : ch) {
			if(m.containsKey(i)) {
				m.put(i, m.get(i)+1);
			}
			else {
				m.put(i, 1);
			}
		}
		for (Entry<Character, Integer> e : m.entrySet()) {
			if(e.getValue()>1) {
				System.out.println(e.getKey() +" : "+e.getValue());
			}
			
		}
	}

}
