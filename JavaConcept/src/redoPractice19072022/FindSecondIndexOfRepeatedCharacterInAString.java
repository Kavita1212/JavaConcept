package redoPractice19072022;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindSecondIndexOfRepeatedCharacterInAString {

	public static void main(String[] args) {

		String s = "GeeksforGeeks";

		char[] ch = s.toCharArray();

		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && m.containsKey(ch[i]) == false) {
					m.put(ch[i], j);
				}
			}
		}
		for (Map.Entry<Character, Integer> e : m.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
}