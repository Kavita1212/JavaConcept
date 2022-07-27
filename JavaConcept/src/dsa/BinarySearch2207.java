package dsa;

public class BinarySearch2207 {

	public static void main(String[] args) {
		int[] a = {2,4,6,9,11,12,14,20,36,48};
		int target =36;
		int index= search(a,target);
		System.out.println(index);
	}
	public static int search(int[] a,int target) {
		
		int start =0;
		int end=a.length-1;
		
		while(start<=end) {
			 int mid=start+(end-start)/2;
			
			if(target<a[mid]) {
				end=mid-1;
			}
			else if(target>a[mid]) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		
		return -1;
	}
}