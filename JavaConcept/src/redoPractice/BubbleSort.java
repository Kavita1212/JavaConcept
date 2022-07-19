package redoPractice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {3,1,5,4,2};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));

	}
	public static void bubbleSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
