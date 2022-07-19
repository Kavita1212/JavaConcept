package redoPractice19072022;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IndexOfFirstNonRepeatingChaInString {

	public static void main(String[] args) {
		String s = "ajeetkumar";
		char[] arr = s.toCharArray();
		int index;
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (Character c : arr) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : m.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (m.get(ch) == 1) {
				index = i;
				System.out.println(ch + " : " + index);
				break;
			}
		}
	}
}
