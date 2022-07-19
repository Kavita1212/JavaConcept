package redoPractice18072022;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a = "Keep";
		String b = "pEEK ";
		boolean op = isAnagram(a, b);
		System.out.println(op);
		
		
				
	}
	public static boolean isAnagram(String s1,String s2) {
		
		s1 = s1.replaceAll("\\s","").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)==true) {
			return true;
		}
		return false;
		
		
	}

}
