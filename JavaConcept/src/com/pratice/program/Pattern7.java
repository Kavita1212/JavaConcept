package com.pratice.program;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=4;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
		}

	}

}
