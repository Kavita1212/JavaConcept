package com.pratice.program;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "madam";
		// String temp = "";
		/*
		 * for (int i = a.length()-1; i>=0; i--) { temp=temp+a.charAt(i); }
		 * if(temp.equals(a)) { System.out.println("Pallindrome"); } else {
		 * System.out.println("Not Pallindrome"); }
		 */
		boolean b = isPallindrome(s);
		System.out.println(b);

	}

	public static boolean isPallindrome(String a) {

		if (a == null || a.length() == 0) {
			return true;
		}

		for (int i = 0; i <= a.length() / 2; i++) {
			char start = a.charAt(i);
			char end = a.charAt(a.length() - 1 - i);
			if (start != end) {
				return false;
			}
		}
		return true;
	}
}
