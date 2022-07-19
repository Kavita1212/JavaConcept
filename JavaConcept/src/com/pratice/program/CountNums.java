package com.pratice.program;

public class CountNums {

	public static void main(String[] args) {
		int num = 1383;
		
		int count=0;
		while(num>0) {
			int rem=num%10;
			if(rem==3) {
				count++;
			}
			num=num/10;
		}
		System.out.println(count);

	}
}