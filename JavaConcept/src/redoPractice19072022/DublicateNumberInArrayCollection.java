package redoPractice19072022;

import java.util.HashMap;
import java.util.Map;

public class DublicateNumberInArrayCollection {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,2,3,5};
		
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for (int i : arr) {
			if(m.containsKey(i)) {
				m.put(i, m.get(i)+1);
			}
			else {
				m.put(i, 1);
			}
		}
		for (Map.Entry<Integer, Integer> e : m.entrySet()) {
			if(e.getValue()>1) {
				System.out.println(e.getKey() +" : "+e.getValue());
			}
			
		}
	}

}
