package com.pratice.program;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4 ; 
		boolean flag=false;
		
		for (int i = 2; i <n; i++) {
			if(n<=1) {
				flag=false;
				break;
			}
			if(n%i == 0) {
				flag = false;
				break;
			}
			else {
				flag = true;
			}
			
		}
		if(flag==true) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}

	}

}
