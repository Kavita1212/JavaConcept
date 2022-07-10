package com.pratice.program;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ke eP ";
		String b = "peEk";
		boolean b1= Anagram.isAnagram(a,b);
		System.out.println(b1);
		

	}
	public static boolean isAnagram(String a,String b) {
		
		a = a.replaceAll("\\s","").toLowerCase();
		b = b.replaceAll("\\s", "").toLowerCase();
		
		if(a.length()!= b.length()) {
			return false;
		}
		
		
		char[] i1 = a.toCharArray();
		char[] i2 = a.toCharArray();

		
		Arrays.sort(i1);
		Arrays.sort(i2);
		
		if(Arrays.equals(i1, i2) == true) {
		
		
		return true;
		
	}
		else
			return false;

}
}
