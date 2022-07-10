package com.pratice.program;

public class PrimeNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b = PrimeNumber3.checkPrime(100);
		System.out.println("op=" + b);
		PrimeNumber3.printPrimeNo(100);
		
	}
	public static boolean checkPrime(int n) {
		
		if(n<=1) {
			return false;
		}
		for (int i = 2; i <n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void printPrimeNo(int n) {
	
		for (int i = 0; i <=n; i++) {
			if(checkPrime(i)==true) {
				System.out.println("number==" + i);
			}
		}
	}
}