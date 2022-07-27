package binarySearch;

public class Ceiling {

	public static void main(String[] args) {
		int[] a = {2,4,6,9,11,12,14,20,36,48}; 
		int target =15;
		int num= findCeiling(a,target);//ceiling=>smallest element in array>=
		System.out.println(num);
	}
	public static int findCeiling(int[] a,int target) {
		
		//if target> greatest number in the array
		if(target>a[a.length-1]) { 
			return -1;
		}
		int s= 0;
		int e = a.length-1;
		while(s<=e) {
			int mid = s+(e-s)/2;
			if(target>a[mid]) {
				s=mid+1;
			}
			else if(target<a[mid]) {
				e=mid-1;
			}
			else {
				return mid;
			}
		}
		return s;
	}

}
