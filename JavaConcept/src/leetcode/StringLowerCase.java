package leetcode;
//https://leetcode.com/problems/to-lower-case/
public class StringLowerCase {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = toLowerCase(s);
		System.out.println(s1);
		/*
		 * Input: s ="Hello" Output: "hello"
		 */

	}

	public static String toLowerCase(String s) {
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (Character.isUpperCase(a[i])) {
				a[i] = Character.toLowerCase(a[i]);
			}

		}
		return String.valueOf(a);
	}
}