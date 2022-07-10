package com.pratice.program;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonExample s = SingletonExample.getInstance();
		SingletonExample s1 = SingletonExample.getInstance();
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		

	}

}
