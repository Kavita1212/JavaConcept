package com.pratice.program;

public class Example {

	public Example() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Constructor");
	}
	static {
		System.out.println("Inside static block");
	}
	public static int sum() {
		return 9;
	}
	public int add() {
		return 10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		Example ex = new Example();
		System.out.println(Example.sum());
		System.out.println(ex.add());

	}

}
