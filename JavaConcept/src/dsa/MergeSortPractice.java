package dsa;

import java.util.Arrays;

public class MergeSortPractice {

	public static void main(String[] args) {
		int a[] = {8,3,4,12,5,6};
		int output[] = mergeSort(a);
		System.out.println(Arrays.toString(output));

	}
	public static int[] mergeSort(int arr[]) {
		if(arr.length==1) {
			return arr;
		}
		int start = 0;
		int end = arr.length;
		int mid = start+end/2;
		
		int left[]=mergeSort(Arrays.copyOfRange(arr, start, mid));
		int right[]=mergeSort(Arrays.copyOfRange(arr, mid, end));
		
		return merge(left,right);
		
		
	}
	public static int[] merge(int first[],int second[]) {
		int mix[] = new int[first.length+second.length];
		int i = 0;
		int j = 0;
		int k =0;
		
		while(i<first.length && j<second.length) {
			if(first[i]<second[j]) {
				mix[k]= first[i];
				i++;
				
			}
			else {
				mix[k]=second[j];
				j++;
				
				
			}
			k++;
		}
		while(i<first.length) {
			mix[k]= first[i];
			i++;
			k++;
		}
		while(j<second.length) {
			mix[k]= second[j];
			j++;
			k++;
		}
		
		return mix;
	}
}