package redoPractice;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class P12_RepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Great Responsibilty";
		char[] ch = s.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (char c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
			
		}
		
		for(Entry<Character,Integer> entry :map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() +":" + entry.getValue());
			}
		}
		
		

	}

}
