package com.pratice.ArrayProgram;

public class CountEvenNoDigit {

	public static void main(String[] args) {
		int[] num = { 18, 124, 9, 1764, 98, 1 };
		int n = countNum(num);
		System.out.println(n);
	}

	public static int countNum(int[] num) {
		int count = 0;
		for (int i : num) {
			if (even(i)) {
				count++;
			}
		}
		return count;
	}

	public static boolean even(int num) {
		int n = countNoOfDigits(num);
		if (n % 2 == 0) {
			return true;
		}
		return false;

	}

	public static int countNoOfDigits(int num) {
		int count = 0;
		while (num == 0) {
			return 1;
		}
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;

	}
}