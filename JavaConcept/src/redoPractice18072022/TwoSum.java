package redoPractice18072022;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] a = {2,7,9,11,15,1,18}; // target - 17
		int target=17;
		int index;
		
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for (int i = 0; i < a.length; i++) {
			m.put(a[i],i);
		}
		
		/*
		 * for(Map.Entry<Integer, Integer> e :m.entrySet()) {
		 * System.out.println(e.getKey() +":"+e.getValue()); }
		 */

		for (int i = 0; i < a.length; i++) {
			int num=a[i];
			int rem = target-num;
			if(m.containsKey(rem)) {
				index=m.get(rem);
				System.out.println(num +":" +index);
			}
		}		
	}

}
