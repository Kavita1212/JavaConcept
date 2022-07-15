package redoPractice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="keep";
		String str2 = "peek";
		boolean b = Anagram.isAnagram(str1, str2);
		System.out.println(b);
	}
	public static boolean isAnagram(String a ,String b) {
		
		if(a.length()!=b.length())
			return false;
		
		char[] ch1 = a.toLowerCase().toCharArray();
		char[] ch2 = b.toLowerCase().toCharArray();
		
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)==true)
		
		return true;
		else
			return false;
		
		
	}
	

}
