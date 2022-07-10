package com.pratice.ArrayProgram;

public class SmallestElement {
	
	public static void main(String[] args) {
		int[] a = {3,4,2,6};
		SmallestElement s = new SmallestElement();
		s.smallElement(a);
	}
	public void smallElement(int[] s) {
		int n = s.length;
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				if(s[i]>s[j]) {
					int temp = s[i];
					s[i] = s[j];
					s[j]= temp;
					
				}
			}
		}
		System.out.println(s[0]);
		/*
		 * for (int i : s) { System.out.println(i);
		 * 
		 * }
		 */
	}
}