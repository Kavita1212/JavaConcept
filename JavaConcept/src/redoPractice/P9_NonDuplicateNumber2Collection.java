package redoPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class P9_NonDuplicateNumber2Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,2,1,3,1,2,4,2,6,7}; //3,4,6,7
		int len = a.length;
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (Integer i : a) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
			
		}
		
		for (Entry<Integer, Integer> m : map.entrySet()) {
			if(m.getValue()==1) {
				System.out.println(m.getKey());
			}
		}
	}
}