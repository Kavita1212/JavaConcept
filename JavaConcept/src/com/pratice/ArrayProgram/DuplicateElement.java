package com.pratice.ArrayProgram;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {2,1,2,5,3,6,1,1};
		int n = a.length;
		FrequencyOfEachElement.elementFrequency(a, n);

	}
	
	public static void elementFrequency(int arr[],int len) {
		int count =1;
		
		for (int i = 0; i < len; i++) {
			//int count=1;
			for (int j = i+1; j < len; j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=0;
				}
			}
			if(count>1 ) {
				System.out.println(arr[i] +" "+count);
			}
		}
	}
}