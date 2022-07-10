package com.pratice.program;

public class SingletonExample {
	private static SingletonExample sign;
	
	private SingletonExample() {
	
		
	}
	public static SingletonExample getInstance() {
		
		if(sign==null) {
			sign = new SingletonExample();
		}
		return sign;
		
	}
	
	

	

}
