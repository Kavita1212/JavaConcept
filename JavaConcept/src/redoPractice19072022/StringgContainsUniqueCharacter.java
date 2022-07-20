package redoPractice19072022;

import java.util.HashMap;
import java.util.Map;

public class StringgContainsUniqueCharacter {

	public static void main(String[] args) {
		String s  = "helo";
		char[] ch = s.toCharArray();
		boolean status = false;
		
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		for (Character c : ch) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}
			else {
				m.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> e : m.entrySet()) {
			System.out.println(e.getKey() +":" +e.getValue());
			if(e.getValue()==1) {
				status=true;
			}
			else {
				status=false;
				break;
			}
		}
		if(status==false) {
			System.out.println(s +"not unique");
		}
		else {
			System.out.println(s+"unique");
		}
	}
}