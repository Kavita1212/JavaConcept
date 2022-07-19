package redoPractice19072022;

import java.util.Arrays;

public class Aangram {

	public static void main(String[] args) {

		System.out.println(isAnagram("Keep","Peek"));
		System.out.println(isAnagram("Keep","ajjk"));

	}
	public static boolean isAnagram(String a ,String b) {
		if(a.length()!=b.length()) {
			return false;
		}
		char[] ch1 = a.toLowerCase().toCharArray();
		char[] ch2 = b.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)== true) {
			return true;
		}
		
			return false;
	}
}