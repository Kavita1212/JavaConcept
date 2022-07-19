package dsa;

import java.util.Arrays;

public class QuickSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,3,2,1};
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));

	}
	public static void quickSort(int[] arr,int low,int high) {
		
		if(low>=high) {
			return;
		}
		int s=low;
		int e=high;
		
		int m = s+(e-s)/2;
		int pivot =arr[m];
		
		while(s<=e) {
			while(arr[s]<pivot) {
				s++;
			}
			while(arr[e]>pivot) {
				e--;
			}
			if(s<=e) {
				int temp = arr[s];
				arr[s]=arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
		}
		quickSort(arr,low,e);
		quickSort(arr, s, high);
		
		
	}

}
