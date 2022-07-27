package binarySearch;

public class Floor {

	public static void main(String[] args) {
		int[] a = {2,4,6,9,11,12,14,20,36,48}; 
		int target =13;
		int num= findFloor(a,target); //floor =>greatest element in array<=
		System.out.println(num);
	}
	public static int findFloor(int[] a,int target) {
		
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
		return e;
	}
}
