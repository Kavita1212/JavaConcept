package dsa;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a  = {4,5,1,2,3};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int last = arr.length-i-1;
			int maxIndex = getMaxIndex(arr,0,last);
			swap(arr,maxIndex,last);
		}
	}
	public static void swap(int[] arr,int first,int second) {
			int temp=arr[first];
			arr[first]=arr[second];
			arr[second]= temp;
		}
	public static int getMaxIndex(int[] arr,int start,int end) {
		int max = start;
		for (int i = start; i <=end; i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
	}
}