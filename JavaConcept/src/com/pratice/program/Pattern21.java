package com.pratice.program;

public class Pattern21 {

	public static void main(String[] args) {
		int num=5;
		int k=1;
		for (int i =1; i <=num; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}

	}

}
