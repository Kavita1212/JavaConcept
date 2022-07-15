package com.pratice.program;

public class Patttern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		for (int i = 1; i <=num; i++) {
			for (int j = num; j >=1; j--) {
				if(i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(j);
				}
				
			}
			System.out.println();
		}

	}

}
