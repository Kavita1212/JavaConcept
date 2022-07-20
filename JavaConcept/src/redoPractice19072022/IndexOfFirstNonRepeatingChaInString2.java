package redoPractice19072022;

import java.util.LinkedList;
import java.util.List;


public class IndexOfFirstNonRepeatingChaInString2 {

	public static void main(String[] args) {
		String s="ajeetkumar";
				
		List<Character> l = new LinkedList<Character>();
		l.add(s.charAt(0));
		
		for (int i = 1; i < s.length(); i++) {
			if(l.contains(s.charAt(i))) {
				l.remove(l.indexOf(s.charAt(i)));
			}
			else {
				l.add(s.charAt(i));
			}
			
		}
		System.out.println(l.get(0));
	}
}