package redoPractice18072022;

import java.util.HashMap;
import java.util.Map;

public class P3_DuplicateCharacterUsingCollection {

	public static void main(String[] args) {
		String str = "aaabccd";
		char[] ch =str.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}

		for(Map.Entry<Character,Integer> entry :map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() +" : "+entry.getValue());
			}
		}
	}

}
