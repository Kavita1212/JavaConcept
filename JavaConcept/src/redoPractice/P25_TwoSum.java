package redoPractice;

import java.util.HashMap;
import java.util.Map;

public class P25_TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {2,7,9,11,15,1,18};
		int target = 17;
		int index;
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], i);
		}
		
		
		
		for (int i = 0; i < a.length; i++) {
			int num=a[i];
			int remain = target-num;
			if(map.containsKey(remain)) {
				index=map.get(remain);
				System.out.println(num + ": " + index);
				
				
			}
			
		}
		
		
	}

}
