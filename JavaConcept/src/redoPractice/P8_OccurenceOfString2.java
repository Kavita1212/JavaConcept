package redoPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P8_OccurenceOfString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is hydrabad and this is part of india"; // is : 4
		String str1 ="is";
        int count=0;
        
        int n = str.length();
        System.out.println(n);
        int n1=str1.length();
        System.out.println(n1);
		
		for(int i=0;i<=str.length()-str1.length();i++)
		{
			if(str.substring(i,i+str1.length()).equalsIgnoreCase(str1))
			{
				count++;
			}
		}
		
		System.out.println("The string "+str1+" occurs "+count+" times");
	}
	}

