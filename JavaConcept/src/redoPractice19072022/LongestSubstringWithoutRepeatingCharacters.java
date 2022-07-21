package redoPractice19072022;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		String s = "abcabcbb";
	
		char[] a = s.toCharArray();
		String current="";
		String overall="";
		Set<Character> st = new HashSet<Character>();
		for (Character c : a) {
			if(st.contains(c)) {
				st.clear();
				current="";
			}
			st.add(c);
			current=current+c;
			if(current.length()>overall.length()) {
				overall=current;
			}
		}
		System.out.println(overall);
	}
}