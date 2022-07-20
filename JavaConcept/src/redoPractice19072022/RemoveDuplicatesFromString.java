package redoPractice19072022;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
	public static String removeDuplicate(String str) 
	{
		Set<Character> st = new HashSet<Character>();
		StringBuffer s = new StringBuffer();
		char[] ch = str.toCharArray();
		for (Character c : ch) {
			if(!st.contains(c)) {
				st.add(c);
				s.append(c);
			}
		}
		return s.toString();
	}
	public static void main(String[] args) 
	{
		System.out.println(removeDuplicate("ajeeeeeeet"));
	}
}