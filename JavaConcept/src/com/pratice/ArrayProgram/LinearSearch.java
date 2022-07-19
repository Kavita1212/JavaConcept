package com.pratice.ArrayProgram;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = {3,4,2,6};
		int target =4;
		System.out.println(linearSearch(a,target));
		

	}
	public static int linearSearch(int arr[],int target) {
		if(arr.length==0) {
			return -1;
		}
		for (int index = 0; index < arr.length; index++) {
			int element = arr[index];
			if(element==target) {
				return index;
			}
			
		}
		return -1;
		
		
		
	}
}
