package redoPractice19072022;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
	public static String removeDuplicate(String str) 
	{
		Set<Character> st = new HashSet<Character>();
		StringBuffer sb =  new StringBuffer();
		char[] arr=str.toCharArray();
		for(Character c : arr ) 
		{
			if(!st.contains(c)) 
			{
				st.add(c);
				sb.append(c);
			}
		}
		return sb.toString();
		
	}
	public static void main(String[] args) 
	{
	
		System.out.println(removeDuplicate("ajeeeeeeet"));

	}
}
