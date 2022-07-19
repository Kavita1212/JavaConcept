package redoPractice18072022;

import java.util.HashMap;
import java.util.Map;

public class P24_IndexofFirstNonRepeatingCharacter2Collection {

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		char[] ch = s.toCharArray();
		int index;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
			map.put(c ,1);
			}
		}
		
		/*
		 * for (Map.Entry<Character,Integer> m :map.entrySet()) {
		 * System.out.println(m.getKey() +":"+m.getValue());
		 * 
		 * }
		 */
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(map.get(c)==1) {
				index=i;
				System.out.println(c +":" +index);
				break;
			}
			
		}
	}

}	