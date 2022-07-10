package redoPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class P10_PrintDuplicateCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a ={"chennai","kolkata","mumbai","chennai","mumbai"};
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		for (String s : a) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}
			else {
				map.put(s, 1);
			}
			
		}
		for(Entry<String,Integer> entry :map.entrySet()){
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
			
		}
		

	}

}
