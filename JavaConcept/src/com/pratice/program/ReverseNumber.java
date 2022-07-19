package com.pratice.program;

public class ReverseNumber {

	public static void main(String[] args) {
		int num =132;
		int sum=0;
		while(num>0) {
			int rem = num%10;
			sum = sum*10+rem;
			num=num/10;
		}
		System.out.println(sum);

	}

}
