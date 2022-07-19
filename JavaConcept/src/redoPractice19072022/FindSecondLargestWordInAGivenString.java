package redoPractice19072022;

import java.util.Arrays;

public class FindSecondLargestWordInAGivenString {

	public static void main(String[] args) {
		String s = "i i good or not";
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if(str[i].length()>str[j].length()) {
					String s1 = str[j];
					str[j]=str[i];
					str[i]=s1;
					
				}
			}
		}
		System.out.println(Arrays.toString(str));
		System.out.println(str[str.length-2]);
	}
}