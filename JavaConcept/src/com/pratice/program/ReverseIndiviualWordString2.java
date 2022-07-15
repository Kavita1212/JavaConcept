package com.pratice.program;

public class ReverseIndiviualWordString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love programming"; //I evol 
		String ans = ReverseIndiviualWordString2.reverseIndividualWord(str);
		System.out.println(ans);
	}
	public static String reverseIndividualWord(String s) {
		String result="";
		int i =0;
		int n = s.length()-1;
		
		while(i<n) {
			while(i<n && s.charAt(i)==' ') {
				i++;
			}
			int j = i+1;
			 if(i>=n || j>=n)break;
			while(j<=n && s.charAt(j)!=' ') {
				j++;
				
			}
			String sub = s.substring(i, j);
			String s1= reverse(sub);
			if(result.length()==0) {
				result = s1;
			}
			else {
				result = result + " " + s1;
			}
			i=j+1;
		}
		
		return result;
		
	}
	public static String reverse(String a) {
		String temp="";
		for (int i = a.length()-1; i >=0; i--) {
			temp = temp+a.charAt(i);
			
		}
		return temp;
		
		
	}

}
