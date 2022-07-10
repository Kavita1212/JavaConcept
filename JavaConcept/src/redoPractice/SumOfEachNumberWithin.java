package redoPractice;

import java.util.Arrays;

public class SumOfEachNumberWithin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 32, 4, 21, 45, 1 };
	
		for (int i : a) {
			int sum = 0;
			while (i != 0) {
				int remainder = i % 10;
				sum = sum + remainder;
				i = i / 10;

			}
			System.out.println(sum);
		}
	}
}