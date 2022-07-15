package com.pratice.program;

public class ReverseIndiviualWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love programming"; //I evol 
		
		String[] s = str.split(" ");
		String rev="";
		
		
		
		for (int i = 0; i < s.length; i++) {
				String word=s[i];
				for (int j = word.length()-1; j >=0; j--) {
					rev= rev+word.charAt(j); 
					
				}
				rev = rev+ " ";
			
		}
		System.out.println(rev.trim());
	
		
		
		
	}

}
