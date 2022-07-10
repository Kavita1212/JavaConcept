package com.pratice.program;

import java.util.HashSet;

class Animal{
	public int i = 12;
	public Animal() {
		i=13;
	}
	public String toString() {
		return "Animal" +i;
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet s = new HashSet();
		s.add(new Animal());
		s.add(new Animal());
		/*
		 * for (Animal a : s) {
		 * 
		 * System.out.println(a); }
		 */

	}

}
