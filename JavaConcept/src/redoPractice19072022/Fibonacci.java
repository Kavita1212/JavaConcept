package redoPractice19072022;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		int[] a = new int[10];
		a[0] = 0;
		a[1] = 1;
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i - 1] + a[i - 2];

		}
		System.out.println(Arrays.toString(a));

	}

}
