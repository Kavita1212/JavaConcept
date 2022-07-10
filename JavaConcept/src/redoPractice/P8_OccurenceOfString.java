package redoPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P8_OccurenceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is hydrabad and this is part of india"; // is : 4
		String ans = isCount(s);
		System.out.println(ans);

	}
	public static String isCount(String str) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		int i = 0;
		int n = str.length() - 1;
		int count = 1;
		while (i < n) {
			while (i < n && str.charAt(i) != 'i')
				i++;
			if (i >= n)
				break;
			int j = i + 1;
			if (str.charAt(i) == 'i' && str.charAt(j) == 's') {
				String sub = str.substring(i, j + 1);
				if (map.containsKey(sub) == false)
					map.put(sub, count);
				else
					map.put(sub, ++count);
			}
			i = j + 1;
		}
		Set<Entry<String, Integer>> set = map.entrySet();
		String result = "";
		for (Entry<String, Integer> entry : set) {
			result = entry.getKey() + " " + ":" + " " + entry.getValue();
		}
		return result;

}
}

