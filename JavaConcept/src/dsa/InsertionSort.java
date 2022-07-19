package dsa;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int a[] = {5,3,4,1,2};
		insertion(a);
		System.out.println(Arrays.toString(a));

	}
	public static void insertion(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j >0; j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]= arr[j-1];
					arr[j-1]= temp;
				}
				else {
					break;
				}
			}
			
		}
	}

}
