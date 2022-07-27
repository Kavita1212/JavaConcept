package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {2,4,6,9,11,12,14,20,36,48};
		int target =14;
		int index = binarySearch(a,target);
		System.out.println(index);

	}
	public static int binarySearch(int[] a,int target) {
		
		int s=0;
		System.out.println("s=="+s);
		int e=a.length-1;
		System.out.println("e=="+e);
		
		while(s<=e) {
			//find middle index
			int mid = s+(e-s)/2;
			System.out.println("mid=="+mid);
			//if target is greater
			if(target>a[mid]) {
				s=mid+1;
			}
			//target is small
			else if(target<a[mid]) {
				e=mid-1;
			}
			//match is found
			else {
				return mid;
			}
		}
		//match not found
		return -1;
	}
}