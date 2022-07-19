package redoPractice18072022;

import java.util.Arrays;

public class DuplicateCity {

	public static void main(String[] args) {
		String[] str = {"chennai","kolkata","mumbai","chennai"};
		Arrays.sort(str);
		
		for (int i = 0; i < str.length; i++) {
			int count=1;
			for (int j = i+1; j < str.length; j++) {
				if(str[i]==str[j]) {
					count++;
				}
				else {
					break;
				}
				i=j;
			}
			if(count>1) {
				System.out.println(str[i]);
			}
		}
	}
}