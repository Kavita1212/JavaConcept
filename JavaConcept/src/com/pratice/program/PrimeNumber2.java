package com.pratice.program;

public class PrimeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b = PrimeNumber2.checkPrime(110);
		System.out.println("op=" + b);
		
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
}
