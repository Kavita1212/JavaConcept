package dsa;

import java.util.Arrays;

public class BubbleSort2207 {

	public static void main(String[] args) {
		int[] a = {3,1,5,4,2};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
		

	}
	public static void bubbleSort(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length-i; j++) {
				if(a[j]<a[j-1]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
	}

}
