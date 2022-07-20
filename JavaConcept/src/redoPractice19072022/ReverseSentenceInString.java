package redoPractice19072022;

import java.util.Arrays;

public class ReverseSentenceInString {

	public static void main(String[] args) {
		String s ="Bala is sexy";
		
		/*
		 * String[] arr=s.split(" "); for(int i=arr.length-1;i>=0;i--) {
		 * System.out.print(arr[i]+" "); }
		 */
		String temp="";
		String[] a = s.split(" ");
		int i =0;
		int j = a.length-1;
		while(i<j) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));
		
	}
}