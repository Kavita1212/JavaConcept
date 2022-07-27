package redoPractice19072022;

import java.util.Arrays;

public class RepeatedCharacterInAlphabeticalOrder {

	public static void main(String[] args) {
		String s = "google"; // ggoo
		char[] a = s.toCharArray();
		String op = "";
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'g' || a[i] == 'o') {
				op += a[i];
			}
		}
		System.out.println(op);
	}
}