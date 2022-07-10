package com.pratice.program;

public class FrequencyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "kkkaaviitttt"; 
		
		char s[] = a.toCharArray();
		
		for (int i = 0; i < s.length; i++) {
			int count = 1;
			for (int j = i+1; j < s.length; j++) {
				if(s[i]==s[j]) {
					count++;
					//System.out.println(s[i] +"=" +count);
					/*
					 * i=j+1; break;
					 */
					//s[j]='0';
				}
				else {
					
					break;
				}
				i=j;
			}
			System.out.println(s[i] +"=" +count);
			//System.out.println("check" + s[i] +"=" +count);
			/*
			 * if(count>=1 && s[i]!='0' ) { System.out.println(s[i] +" "+ count); }
			 */
		}
	}
}