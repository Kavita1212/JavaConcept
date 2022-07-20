package redoPractice19072022;

import java.util.Arrays;

public class TwoArraysEqualOrNot {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5 };
		int[] y = { 1, 2, 3, 4, 5 };

		// System.out.println(Arrays.equals(x, y));

		boolean status = false;

		for (int i = 0; i < x.length; i++) {
			if (x[i] != y[i] || x.length != y.length) {
				status = false;
				break;
			}
			status = true;
		}
		if (status == true) {
			System.out.println("Array equal");
		} else {
			System.out.println("Array not equal");
		}
	}
}