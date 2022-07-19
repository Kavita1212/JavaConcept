package com.pratice.program;

public class Fibonaci {

	public static void main(String[] args)
	{
		int a = 0;
		int b = 1;
		int n = 7;
		int count = 2;
		while(count<=n) {
			int temp=b;
			b=a+b;
			a=temp;
			count++;
		}
		System.out.println(b);
	}
}