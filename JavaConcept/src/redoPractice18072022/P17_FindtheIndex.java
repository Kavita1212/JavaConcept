package redoPractice18072022;

public class P17_FindtheIndex {

	public static void main(String[] args) {
		int[] a = {5,7,8,8,9,10} ;
		int target = 7;
		
		int output = findIndex(a, target);
		System.out.println(output);
	

	}
	public static int findIndex(int[] arr,int target) {
		if(arr.length==1) {
			return 1;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
}