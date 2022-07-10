package com.pratice.program;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		int finNumber = num;
		int sum =0;
		
		while(num!=0) {
			int remainder = num%10;  
			sum = sum*10+remainder;
			num=num/10;
			
		}
		if(sum==finNumber) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("Not pallindrome");
		}
	}

}
