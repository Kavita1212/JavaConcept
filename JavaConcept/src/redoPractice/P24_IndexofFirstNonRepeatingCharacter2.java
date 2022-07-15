package redoPractice;

import java.util.HashMap;
import java.util.Map;

public class P24_IndexofFirstNonRepeatingCharacter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeksforgeeks";
		
		int index;
		
		char[] ch = s.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(Character c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		/*
		 * for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		 * System.out.println(entry.getKey() +" : "+entry.getValue());
		 * 
		 * }
		 */
		
		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			if(map.get(ch1)==1) {
				index = i;
				System.out.println(ch1 +" : "+ index);
				break;
				
			}
			
		}

	}
	

}
