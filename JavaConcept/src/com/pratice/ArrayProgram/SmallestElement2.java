package com.pratice.ArrayProgram;

public class SmallestElement2 {
	
	public static void main(String[] args) {
		int[] a = {3,4,2,6};
		SmallestElement2 s = new SmallestElement2();
		int output = s.smallElement(a);
		System.out.println(output);
	}
	public int smallElement(int[] s) {
		int min = s[0];
		for (int i = 1; i < s.length; i++) {
			if(s[i]<min) {
				min=s[i];
			}
		}
		return min;
	}
}