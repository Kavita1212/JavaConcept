package com.pratice.program;

import java.util.Arrays;

public class PrintZeroAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 0, 2, 0, 0, 4, 5 };

		//1st iteration- 1 2 0 0 0 4 5

		int j = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {

				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;

			}
			//System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));

	}
}
