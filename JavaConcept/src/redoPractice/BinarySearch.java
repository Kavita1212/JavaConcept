package redoPractice;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {2,4,6,9,11,12,14,20,36,48};
		int target = 36;
		int index = binarySearch(a,target);
		System.out.println(index);

	}
	public static int binarySearch(int arr[],int target) {
		
		int s = 0;
		int e = arr.length-1;
		
		while(s<=e) {
			int mid = s+(e-s)/2;
			
			if(target>arr[mid]) {
				s=mid+1;
			}
			else if(target<arr[mid]) {
				e=mid-1;
			}
			else if(target==arr[mid]) {
				return mid;
			}
		}
		return -1;
	}
}